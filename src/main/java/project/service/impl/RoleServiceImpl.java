package project.service.impl;

import org.springframework.stereotype.Service;
import project.models.entity.UserRoleEntity;
import project.models.entity.enums.UserRole;
import project.repository.RoleRepository;
import project.service.RoleService;

import java.util.Arrays;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void initRoles() {
        if (roleRepository.count() == 0) {
            Arrays.stream(UserRole.values())
                    .forEach(r -> {
                        UserRoleEntity userRoleEntity = new UserRoleEntity();
                        userRoleEntity.setRole(r);
                        this.roleRepository.save(userRoleEntity);
                    });

        }
    }

    @Override
    public UserRoleEntity findByName(UserRole userRole) {
        return this.roleRepository.findByRole(userRole).orElse(null);
    }


}
