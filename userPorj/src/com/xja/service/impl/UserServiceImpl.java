package com.xja.service.impl;

import com.xja.dao.impl.UserDAOImpl;
import com.xja.dao.UserDAO;
import com.xja.domain.Users;
import com.xja.exception.UserNameException;
import com.xja.exception.UserPassException;
import com.xja.service.UserService;
import com.xja.util.ConnUtil;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO = new UserDAOImpl();
    @Override
    public void reg(Users user) {
        try {
            if (userDAO.selectByName(user.getUserName()) == null){   // 用户名不存在时
                ConnUtil.getConn().setAutoCommit(false);  // 手动打开事务
                userDAO.insert(user);   // 插入记录
                System.out.println("注册成功！！!");
                ConnUtil.getConn().commit();   // 提交事务
            } else {  // 当用户名存在时
                System.out.println("注册失败！！！");
                throw new UserNameException("用户名重复");
            }
        } catch (SQLException | UserNameException e){
            e.printStackTrace();
            try {
                ConnUtil.getConn().rollback();  // 回滚事务
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }

    }
    
    @Override
    public Users login(Users user)
            throws UserPassException,UserNameException{
        try {
            if (userDAO.selectByName(user.getUserName())!=null){
                if (userDAO.selectByName(user.getUserName()).getUserPass().equals(user.getUserPass())){
                    return user;
                }else {
                    throw new UserPassException("密码错误");
                }
            }else {
                throw new UserNameException("用户名不存在");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }finally {
            ConnUtil.closeConn();
        }
    }
}
