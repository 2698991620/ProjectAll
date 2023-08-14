package com.xja.service;

import com.xja.domain.User;
import com.xja.exception.UserNameException;
import com.xja.exception.UserPassException;

/**
 * 用户的业务类。在这个类中封装了所有用户的业务方法
 */
public interface UserService {
    /**
     * 登录验证的方法
     *
     * @param userName 用户名
     * @param userPass 密码
     * @return 登录验证成功时返回用户对象
     * @throws UserNameException 当用户名不存在时抛出异常
     * @throws UserPassException 当密码错误时抛出异常
     */
    User isLogin(String userName, String userPass) throws UserNameException, UserPassException;
}
