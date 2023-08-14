package com.xja.test;

import com.xja.exception.DeptException;

public class ThrowsTest {
    /**
     *
     * @throws ClassNotFoundException
     * @throws DeptException 当部门编写填写错误时抛出的异常。
     */
    public void test01() throws ClassNotFoundException, DeptException {
        Class.forName("");
    }
}
