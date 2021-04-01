package project.service.impl;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import project.models.entity.UserRoleEntity;
import project.models.entity.enums.UserRole;
import project.repository.RoleRepository;
import project.service.impl.RoleServiceImpl;

@ExtendWith(MockitoExtension.class)
public class RolseServiceTest {
    private RoleServiceImpl roleService;

    @Mock
    RoleRepository roleRepository;

    @BeforeEach
    public void setUp() {
//        RoleServiceImpl roleService = new RoleServiceImpl(roleRepository);
        roleService = new RoleServiceImpl(roleRepository);
    }

    @Test
    void findByName() {

        UserRoleEntity userRoleEntity = new UserRoleEntity();
        userRoleEntity.setRole(UserRole.USER);

        Mockito.when(roleRepository.findByRole(UserRole.USER)).thenReturn(userRoleEntity);
        Assertions.assertEquals(userRoleEntity, roleService.findByName(UserRole.USER));
    }


}
