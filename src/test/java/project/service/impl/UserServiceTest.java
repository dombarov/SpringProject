package project.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.util.Assert;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import project.models.entity.UserEntity;
import project.models.entity.UserRoleEntity;
import project.models.entity.enums.UserRole;
import project.models.service.UserServiceModel;
import project.repository.RoleRepository;
import project.repository.UserRepository;
import project.service.RoleService;
import project.service.impl.RentaCarUserService;
import project.service.impl.UserServiceImpl;
import project.view.UserViedModel;

import java.util.*;
import java.util.stream.Collectors;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    private UserServiceImpl userServiceImpl;


    @Mock
    UserRepository userRepository;
    @Mock
    RoleRepository roleRepository;
    @Mock
    PasswordEncoder passwordEncoder;
    @Mock
    ModelMapper modelMapper;
    @Mock
    RoleService roleService;
    @Mock
    RentaCarUserService rentaCarUserService;

    @BeforeEach
    public void setup() {
        userServiceImpl = new UserServiceImpl(userRepository, roleRepository, passwordEncoder, modelMapper, roleService, rentaCarUserService);
    }

    @Test
    public void userNotFoundTest() {
        Assertions.assertThrows(UsernameNotFoundException.class, () -> {
            rentaCarUserService.loadUserByUsername("user_not_found");
        });
    }


    @Test
    void findByUsername() {

        UserEntity userEntity = new UserEntity();
        UserRoleEntity userRoleEntity = new UserRoleEntity();
        userRoleEntity.setRole(UserRole.USER);
        userRoleEntity.setId("22");
        userEntity.setUsername("sashoto")
                .setPassword("111")
                .setEmail("dad@aacac")
                .setRoles(List.of(userRoleEntity));
        userEntity.setId("111");

        System.out.println();
        userRepository.save(userEntity);

        Mockito.when(userRepository.findByUsername("sashoto")).thenReturn(Optional.of(userEntity));
        Assertions.assertEquals(userEntity, userServiceImpl.findByUserName("sashoto"));
    }

    @Test
    public void testUserNotFound() {
        Assertions.assertThrows(UsernameNotFoundException.class, () -> {
            rentaCarUserService.loadUserByUsername("user_does_not_exists");
        });
    }

//    @Test
//    public void findBuUsernameIsCorrectly(){
//        UserRoleEntity userRoleEntity = new UserRoleEntity();
//        userRoleEntity.setRole(UserRole.USER);
//        userRoleEntity.setId("11111");
//        UserEntity userEntity = new UserEntity();
//        userEntity.setUsername("testing");
//        userEntity.setPassword("11111");
//        userEntity.setEmail("ada@asaaaa");
//        userEntity.setRoles(List.of(userRoleEntity));
//        userEntity.setId("22222");
//        System.out.println();
//        userRepository.save(userEntity);
//
//        Mockito.when(userRepository.findByUsername("testing")).thenReturn(Optional.of(userEntity));
//        Assertions.assertEquals(userEntity, userServiceImpl.findByUserName(userEntity.getUsername()));
//
//    }

    @Test
    void userNameExistsTest() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername("testUsername");

        Mockito.when(userRepository.findByUsername("testUsername")).thenReturn(Optional.of(userEntity));

        Assertions.assertTrue(userServiceImpl.ifUserExist("testUsername"));

    }


    @Test
    public void userRegisterTest() {
        UserServiceModel userEntity = new UserServiceModel();
        userEntity.setUsername("peshko").setEmail("test@test").setPassword("11111");

        UserRoleEntity userRoleEntity = new UserRoleEntity();
        userRoleEntity.setRole(UserRole.USER);
        Mockito.when(roleService.findByName(UserRole.USER)).thenReturn(userRoleEntity);
        UserEntity user = new UserEntity();
        user.setEmail("test@test").setUsername("peshko").setPassword("11111");
        Mockito.when(modelMapper.map(userEntity, UserEntity.class)).thenReturn(user);
        userServiceImpl.register(userEntity);
        System.out.println();
        Mockito.verify(userRepository).save(user);
        System.out.println();
    }

//    @Test
//    public void findAllUsersTest(){
//        OngoingStubbing<Optional<UserEntity>> optionalOngoingStubbing = Mockito.when(userRepository.findByUsername("tester")).thenReturn(List.of("tester1", "tester"));
//        List<UserViedModel> allUsers = userServiceImpl.findAllUsername();
//
//    }

    @Test
    void testUserExist() {
        UserRoleEntity userRole = new UserRoleEntity();
        userRole.setRole(UserRole.USER);

        UserRoleEntity adminRole = new UserRoleEntity();
        adminRole.setRole(UserRole.ADMIN);

        UserEntity userEntity = new UserEntity();

        userEntity.setUsername("sasho")
                .setEmail("sasho_dada@bv.bg")
                .setPassword("pentagona");
//        userEntity.setId("1222");
        userEntity.setRoles(List.of(userRole, adminRole));

        Mockito.when(userRepository.findByUsername("sasho")).thenReturn(Optional.of(userEntity));
        UserDetails userDetails = rentaCarUserService.loadUserByUsername("sasho");

        Assertions.assertEquals(userEntity.getUsername(), userDetails.getUsername());
        Assertions.assertEquals(2, userDetails.getAuthorities().size());


        Set<String> authorities = userDetails
                .getAuthorities()
                .stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Assertions.assertTrue(authorities.contains("ROLE_ADMIN"));
        Assertions.assertTrue(authorities.contains("ROLE_USER"));
    }


    public void init() {
        UserRoleEntity userRoleEntity = new UserRoleEntity();
        userRoleEntity.setRole(UserRole.USER);
        UserEntity userEntity = new UserEntity();

        userEntity.setUsername("sasho")
                .setEmail("sasho_dada@bv.bg")
                .setPassword("pentagona")
                .setRoles(List.of(userRoleEntity));
        userEntity.setId("1222");

        userEntity = userRepository.save(userEntity);
    }
}
