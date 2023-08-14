package com.xja.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 项目名称: com.xja.util <br/>
 * 文件名称: ConnectionUtil <br/>
 * 描述: [类型描述] <br/>
 * 创建时间: 2023/8/4:19:23 <br/>
 * 包名：com.xja.util
 *
 * @author: 宸
 * @description: TODO
 * @version: 1.0
 */
public class ConnectionUtil {
	public static void sqlUpdate(String sql) throws SQLException{
		String url="jdbc:mysql://localhost:3306/scott?useUnicode=true&serverTimezone=GMT&characterEncoding=UTF-8&useSSL=false";
		String username="root";
		String password="root";
		
		//创建数据库连接对象
		Connection conn = DriverManager.getConnection(url,username,password);
		PreparedStatement pstat =conn.prepareStatement(sql);
		System.out.println(pstat.executeUpdate());
		conn.close();
	}
	public static void sqlSelect(String sql) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/scott?useUnicode=true&serverTimezone=GMT&characterEncoding=UTF-8&useSSL=false";
		String username = "root";
		String password = "root";
		
		//创建数据库连接对象
		Connection conn = DriverManager.getConnection(url, username, password);
		ArrayList<String> arrayList = new ArrayList<>();
		
	}
	
}
