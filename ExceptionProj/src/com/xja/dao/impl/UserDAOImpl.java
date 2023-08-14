package com.xja.dao.impl;

import com.xja.dao.UserDAO;
import com.xja.domain.User;

public class UserDAOImpl implements UserDAO {
    @Override
    
    public User findByName(String userName) {
        User user = null;
        switch (userName){
            case "admin":
                user = new User();
                user.setUserName("admin");
                user.setUserPass("123456");
                user.setUserPhone("158XXXX8579");
                return user;
            case "user":
                user = new User();
                user.setUserName("user");
                user.setUserPass("244466666");
                user.setUserPhone("185XXXXXXXX");
                return user;
            default:
                return user;
        }
    }
}
