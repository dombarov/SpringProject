package project.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import project.models.entity.UserEntity;
import project.models.entity.UserRoleEntity;
import project.models.entity.enums.UserRole;
import project.models.service.UserServiceModel;
import project.repository.RoleRepository;
import project.repository.UserRepository;
import project.service.RoleService;
import project.service.UserService;
import project.view.UserViedModel;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;
    private final RoleService roleService;
    private final RentaCarUserService rentaCarUserService;


    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder, ModelMapper modelMapper, RoleService roleService, RentaCarUserService rentaCarUserService) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
        this.modelMapper = modelMapper;
        this.roleService = roleService;
        this.rentaCarUserService = rentaCarUserService;
    }


    @Override
    public void initUsers() {

        if (userRepository.count() == 0) {
            System.out.println();
            UserRoleEntity adminRole = new UserRoleEntity().setRole(UserRole.ADMIN);
            UserRoleEntity userRole = new UserRoleEntity().setRole(UserRole.USER);

            roleRepository.saveAll(List.of(adminRole, userRole));
            UserEntity admin = new UserEntity().setUsername("admin").setEmail("admin@abv.bg").setPassword(passwordEncoder.encode("topsecret"));
            UserEntity user = new UserEntity().setUsername("user").setEmail("user@abv.bg").setPassword(passwordEncoder.encode("topsecret"));
            admin.setRoles(List.of(adminRole, userRole));
            user.setRoles(List.of(userRole));
            userRepository.saveAll(List.of(admin, user));

        }

    }

    @Override
    public boolean ifUserExist(String username) {
        return this.userRepository.findByUsername(username).isPresent();
    }

    @Override
    public void register(UserServiceModel userServiceModel) {
        UserEntity user = this.modelMapper.map(userServiceModel, UserEntity.class);
        user.setRoles(List.of(this.roleService.findByName(UserRole.USER)))
                .setPassword(this.passwordEncoder.encode(userServiceModel.getPassword()));

        this.userRepository.save(user);


//       UserDetails principal = rentaCarUserService.loadUserByUsername(user.getUsername());
//
//        Authentication authentication = new UsernamePasswordAuthenticationToken(
//            principal,
//                user.getPassword(),
//                principal.getAuthorities()
//        );
//
//        SecurityContextHolder.getContext().setAuthentication(authentication);

    }


    @Override
    public UserEntity findByUserName(String username) {
        return this.userRepository.findByUsername(username)
                .map(user -> this.modelMapper.map(user, UserEntity.class)).orElse(null);
    }

    public String getUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            UserDetails userPrincipal = (UserDetails) authentication.getPrincipal();
            return userPrincipal.getUsername();
        }
        return null;
    }

    @Override
    public List<UserViedModel> findAllUsername() {
        return userRepository.findAll()
                .stream()
                .map(userEntity -> this.modelMapper.map(userEntity, UserViedModel.class)).collect(Collectors.toList());
    }

    @Override
    public void addAdminROle(String id) {
        UserEntity user = this.userRepository.findById(id).orElse(null);
        System.out.println();
        assert user != null;
        List<UserRoleEntity> roles = user.getRoles();

        if (roles.size() == 1) {
            UserRoleEntity adminRole = roleRepository.findByRole(UserRole.ADMIN);
            UserRoleEntity userRole = roleRepository.findByRole(UserRole.USER);

            user.setRoles(List.of(adminRole, userRole));
            userRepository.save(user);
        }


    }

    @Override
    public void deleteByID(String id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public void removeAdmin(String id) {
        UserEntity user = this.userRepository.findById(id).orElse(null);
        System.out.println();
        assert user != null;
        List<UserRoleEntity> roles = user.getRoles();

        if (roles.size() == 2) {
            UserRoleEntity userRole = roleRepository.findByRole(UserRole.USER);

            user.setRoles(List.of(userRole));
            userRepository.save(user);
        }

    }


}
