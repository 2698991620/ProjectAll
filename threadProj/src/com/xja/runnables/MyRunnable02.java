package com.xja.runnables;

public class MyRunnable02 implements Runnable{
    private int count = 1;
    @Override
    public void run() {
        int t = count;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t = t + 1;
        count = t;
    }

    public void dis(){
        System.out.println(count);
    }
}
