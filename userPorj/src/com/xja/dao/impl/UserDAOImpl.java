package com.xja.dao.impl;

import com.xja.dao.UserDAO;
import com.xja.domain.Users;
import com.xja.util.ConnUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAOImpl implements UserDAO {
    @Override
    public void insert(Users user) throws SQLException {
        String sql = "insert into users(user_name,user_pass,user_address,user_phone) values(?,?,?,?)";
        Connection conn = ConnUtil.getConn();  // 获取连接对象
        PreparedStatement pstat = conn.prepareStatement(sql);

        pstat.setString(1,user.getUserName());
        pstat.setString(2,user.getUserPass());
        pstat.setString(3,user.getUserAddress());
        pstat.setString(4,user.getUserPhone());

        pstat.executeLargeUpdate();   // 执行sql语句

    }

    @Override
    public Users selectByName(String userName) throws SQLException {
        String sql = "select * from users where user_name = ?";
        Connection conn = ConnUtil.getConn();

        PreparedStatement pstst = conn.prepareStatement(sql);
        pstst.setString(1,userName);
        
        ResultSet rs = pstst.executeQuery();
        if (rs.next()){
            Users user = new Users();
            user.setUserId(rs.getInt("user_id"));
            user.setUserName(rs.getString("user_name"));
            user.setUserPass(rs.getString("user_pass"));
            user.setUserAddress(rs.getString("user_address"));
            user.setUserPhone(rs.getString("user_phone"));
            return user;
        }else {
            return null;
        }

    }
}
