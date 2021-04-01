package project.view;

import project.models.entity.UserRoleEntity;

import java.util.List;

public class UserViedModel {
    private String id;
    private String username;
    private List<UserRoleEntity> roles;

    public UserViedModel() {
    }

    public String getId() {
        return id;
    }

    public UserViedModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserViedModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public List<UserRoleEntity> getRoles() {
        return roles;
    }

    public UserViedModel setRoles(List<UserRoleEntity> roles) {
        this.roles = roles;
        return this;
    }
}
