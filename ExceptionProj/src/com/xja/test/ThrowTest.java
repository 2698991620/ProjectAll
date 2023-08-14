package com.xja.test;

import com.xja.exception.DeptException;
import org.junit.Test;

public class ThrowTest {
    @Test
    public void test01(){
        try {
            int i = 9;
            if(i<1 || i>8){
                throw new DeptException("部门编号只能是1-8！");
            }
            System.out.println(i);
        }catch (DeptException e) {
            System.out.println("DeptException");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Exception");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
