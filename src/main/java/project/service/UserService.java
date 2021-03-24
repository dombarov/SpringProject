package project.service;

import project.models.entity.UserEntity;
import project.models.service.UserServiceModel;

public interface UserService {
    void register(UserServiceModel userServiceModel);

    UserEntity findByUserName(String username);
//    UserEntity findByUserName(String username);
    void initUsers();
    boolean ifUserExist(String username);

    String getUsername();

}
