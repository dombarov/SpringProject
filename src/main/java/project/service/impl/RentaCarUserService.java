package project.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import project.models.entity.UserEntity;
import project.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class RentaCarUserService implements UserDetailsService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public RentaCarUserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

       UserEntity user = userRepository.findByUsername(username)
               .orElseThrow(() -> new UsernameNotFoundException(username));
       return mapToUserDetails(user);
    }

    private UserDetails mapToUserDetails(UserEntity user){
        List<GrantedAuthority> authorities =
                user.getRoles()
                .stream()
                .map(r -> new SimpleGrantedAuthority( r.getRole().name())).collect(Collectors.toList());

//        return new org.springframework.security.core.userdetails.User(user.getUsername(),
//                user.getPassword(),authorities);
        return new User(user.getUsername(),user.getPassword(),authorities);
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),authorities);
    }


}
