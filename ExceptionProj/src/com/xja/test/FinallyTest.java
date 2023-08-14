package com.xja.test;

import org.junit.Test;

public class FinallyTest {
    @Test
    public void test01(){
        try{
            int b = 0;
            int c = 10 / b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("catch块！");
        }finally{
            System.out.println("finally块，一定要执行！");
        }
    }
}
