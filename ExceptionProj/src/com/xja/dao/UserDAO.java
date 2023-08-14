package com.xja.dao;

import com.xja.domain.User;

public interface UserDAO {
    /**
     * 按用户名查询用户对象的方法
     * @param userName 用户名
     * @return 查询到的用户对象
     */
    User findByName(String userName);
}
