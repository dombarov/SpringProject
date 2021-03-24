package project.service;

import project.models.entity.UserRoleEntity;
import project.models.entity.enums.UserRole;

public interface RoleService {
    void initRoles();
    UserRoleEntity findByName(UserRole userRole);
}
