package org.yzc.server;

import org.yzc.common.model.User;
import org.yzc.common.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User getUser(User user) {
        System.out.println("用户名:" + user.getName());
        return user;
    }

}
