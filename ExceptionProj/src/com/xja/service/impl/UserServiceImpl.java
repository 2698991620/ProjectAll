package com.xja.service.impl;

import com.xja.dao.UserDAO;
import com.xja.dao.impl.UserDAOImpl;
import com.xja.domain.User;
import com.xja.exception.UserNameException;
import com.xja.exception.UserPassException;
import com.xja.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO = new UserDAOImpl();
    @Override
    public User isLogin(String userName, String userPass)
            throws UserNameException, UserPassException {
        if("admin".equals(userName)){
            if("123456".equals(userPass)) {
                User user = new User();
                user.setUserName(userName);
                user.setUserPass(userPass);
                user.setUserPhone("158XXXX8579");
                return user;
            }else{
                throw new UserPassException("密码错误！");
            }
        }else{
            //手动抛出用户名不存在的异常类
            throw new UserNameException("用户名不存在！");
        }
    }
}
