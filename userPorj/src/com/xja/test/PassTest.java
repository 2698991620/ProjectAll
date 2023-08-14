package com.xja.test;

import com.xja.domain.Users;
import com.xja.exception.UserNameException;
import com.xja.exception.UserPassException;
import com.xja.service.UserService;
import com.xja.service.impl.UserServiceImpl;

/**
 * 项目名称: com.xja.test <br/>
 * 文件名称: PassTest <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/8/10:20:06 <br/>
 * 包名：com.xja.test
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public class PassTest {
	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		Users user = new Users();
		user.setUserName("peter");
		user.setUserPass("654321");
		try {
			userService.login(user);
			System.out.println("登陆成功");
			
		} catch (UserNameException | UserPassException e) {
			throw new RuntimeException(e);
		}
		Users user1 = new Users();
		
	}
}
