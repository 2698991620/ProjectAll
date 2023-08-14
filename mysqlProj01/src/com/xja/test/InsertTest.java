package com.xja.test;

import com.xja.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 项目名称: com.xja.test <br/>
 * 文件名称: InsertTest <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/8/4:14:51 <br/>
 * 包名：com.xja.test
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public class InsertTest {
	public static void main(String[] args) throws Exception {
		String sql="insert into dept values (67,'相关部门','不详')";
		
		ConnectionUtil.sqlUpdate(sql);
	}
}
