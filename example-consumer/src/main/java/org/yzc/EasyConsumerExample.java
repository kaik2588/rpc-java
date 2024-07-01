package org.yzc;

import org.yzc.common.model.User;
import org.yzc.common.service.UserService;

public class EasyConsumerExample {
    public static void main(String[] args){
        UserService userService = null;
        User user = new User();
        user.setName("yzc");
        //调用
        User newUser = userService.getUser(user);
        if(newUser != null){
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }

    }
}
