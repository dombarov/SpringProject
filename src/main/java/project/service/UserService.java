package project.service;

import project.models.entity.UserEntity;
import project.models.entity.enums.UserRole;
import project.models.service.UserServiceModel;
import project.view.UserViedModel;

import java.util.List;

public interface UserService {
    void register(UserServiceModel userServiceModel);

    UserEntity findByUserName(String username);

    //    UserEntity findByUserName(String username);
    void initUsers();

    boolean ifUserExist(String username);

    String getUsername();


    List<UserViedModel> findAllUsername();

    void addAdminROle(String id);


    void deleteByID(String id);

    void removeAdmin(String id);
}
