package com.xja.test;

import com.xja.domain.Users;
import com.xja.exception.UserNameException;
import com.xja.service.impl.UserServiceImpl;
import com.xja.service.UserService;

public class userTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        Users user = new Users();
        user.setUserName("很多事");
        user.setUserPass("123456");
        user.setUserAddress("北京");
        user.setUserPhone("123****8754");

        try {
            userService.reg(user);
        } catch (UserNameException e) {
            throw new RuntimeException(e);
        }
        System.out.println("end!");
    }
}
