package com.xja.test;

import com.xja.domain.User;
import com.xja.exception.UserNameException;
import com.xja.exception.UserPassException;
import com.xja.service.UserService;
import com.xja.service.impl.UserServiceImpl;
import org.junit.Test;

public class UserServiceTest {
    private UserService userService=new UserServiceImpl();
    @Test
    public void isLogin(){
        String userName="admin";
        String userPass="123456";
        try {
            User user = userService.isLogin(userName, userPass);
            System.out.println("登录成功！"+user);
        } catch (UserNameException e) {
            System.out.println("登录失败！"+e.getMessage());
        } catch (UserPassException e) {
            System.out.println("登录失败！"+e.getMessage());
        }
    }
}
