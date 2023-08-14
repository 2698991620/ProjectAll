package com.xja.test;

import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest {
    @Test
    public void test04(){
        int a = 10;
        Scanner scanner = new Scanner(System.in);
        try {
            int b = scanner.nextInt();
            int c = a / b;
            System.out.println(c);
        }catch (ArithmeticException|InputMismatchException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("end");
    }
    @Test
    public void test03(){
        int a = 10;
        Scanner scanner = new Scanner(System.in);
        try {
            int b = scanner.nextInt();
            int c = a / b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("InputMismatchException");
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("end");
    }
    @Test
    public void test02() {
        try {
            Class.forName("com.xja.test. RuntimeExceptionTest");
            System.out.println("end");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("正常结束！");
    }


    @Test
    public void test01() {
        int a = 10;
        int b = 0;
        if (b == 0) {
            System.out.println("除数不能为0！请输入一个合法的除数。");
        } else {
            int c = a / b;
            System.out.println(c);
        }
        System.out.println("end");
    }
}
