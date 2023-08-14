package com.xja.test;

import com.xja.runnables.MyRunnable02;

public class Run02Test {
    public static void main(String[] args) {
        MyRunnable02 r02 = new MyRunnable02();
        Thread t01 = new Thread(r02,"t01");
        Thread t02 = new Thread(r02,"t02");

        t01.start();
        t02.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        r02.dis();
    }
}
