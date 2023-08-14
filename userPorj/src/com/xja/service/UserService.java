package com.xja.service;

import com.xja.domain.Users;
import com.xja.exception.UserNameException;
import com.xja.exception.UserPassException;

/**
 * 封装用户业务方法的接口
 */
public interface UserService {
    /**
     * 用户注册业务
     * @param user 用户对象
     * @throws UserNameException  账号存在时抛出
     */
    public void reg(Users user) throws UserNameException;
    
    public Users login(Users user) throws UserNameException, UserPassException;
}
