package com.xja.util;

import com.sun.xml.internal.bind.v2.TODO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnUtil {
    private static Connection conn;
    private static final String URL = "jdbc:mysql://localhost:3306/goods" +
            "?useUnicode=true&serverTimezone=GMT&characterEncoding=UTF-8&useSSL=false";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";
    /**
     * 获取数据库连接对象的方法
     * @return 连接对象
     */
    public static Connection getConn() throws SQLException {
        if(conn==null || conn.isClosed()) {
            conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        }
        return conn;
    }

    /**
     * 关闭数据库连接的方法
     */
    public static void closeConn(){
        try {
            //3 关闭数据库连接
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            conn = null;
        }
    }
}
