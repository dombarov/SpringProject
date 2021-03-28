package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.models.entity.UserRoleEntity;
import project.models.entity.enums.UserRole;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<UserRoleEntity, String> {
    UserRoleEntity findByRole(UserRole userRole);
}
