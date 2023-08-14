package com.xja.test;

import com.xja.runnables.MyRunnable;
import com.xja.threads.MyThread01;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread01 t01 = new MyThread01();//创建了一个线程对象。
        t01.setName("t01");
        t01.start();//表示启动t01个线程。从这个位置开始，开辟了一个新的线程
        MyThread01 t04 = new MyThread01();//创建了一个线程对象。
        t04.setName("t04");
        t04.start();//表示启动t01个线程。从这个位置开始，开辟了一个新的线程

        MyRunnable r01 = new MyRunnable();//任务
        Thread t02 = new Thread(r01,"t02");//线程，搭载r01任务
        t02.start();
        Thread t03 = new Thread(r01);//线程，搭载r01任务
        t03.setName("t03");
        t03.start();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("main:"+i);
        }

    }
}
