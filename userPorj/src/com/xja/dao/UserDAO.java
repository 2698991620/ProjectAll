package com.xja.dao;

import com.xja.domain.Users;

import java.sql.SQLException;

public interface UserDAO {
    /**
     * 插入新用户的方法
     * @param user  用户对象
     * @throws SQLException
     */
    public void insert(Users user) throws SQLException;

    /**
     * 按账号查找用户
     * @param userName 用户名
     * @return  用户对象
     * @throws SQLException
     */
    public Users selectByName(String userName) throws SQLException;
}
