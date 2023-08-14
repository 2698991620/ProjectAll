package com.xja.test;

import com.xja.domain.Account;
import com.xja.runnables.LoadRunnable;
import com.xja.runnables.SaveRunnable;

import java.util.Vector;

public class SaveLoadTest {
    public static void main(String[] args) {
        Account account = new Account(1000D);

        SaveRunnable saveRunnable = new SaveRunnable(account,5000D);
        Thread saveThread = new Thread(saveRunnable);
        LoadRunnable loadRunnable = new LoadRunnable(account,500d);
        Thread loadThread = new Thread(loadRunnable);

        saveThread.start();
        loadThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(account);
    }
}
