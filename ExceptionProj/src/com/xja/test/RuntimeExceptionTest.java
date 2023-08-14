package com.xja.test;

import org.junit.Test;

import java.sql.SQLException;

public class RuntimeExceptionTest {
    @Test
    public void test01(){
        throw new NullPointerException();
    }
}
