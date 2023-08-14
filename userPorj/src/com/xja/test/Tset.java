package com.xja.test;

import com.xja.util.ConnUtil;

import java.sql.SQLException;

public class Tset {
    public static void main(String[] args) throws SQLException {
        System.out.println(ConnUtil.getConn());
        ConnUtil.closeConn();

    }
}
