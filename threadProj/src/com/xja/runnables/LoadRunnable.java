package com.xja.runnables;

import com.xja.domain.Account;

public class LoadRunnable implements Runnable{
    private Account account;
    private Double money;
    public LoadRunnable(Account account, Double money) {
        this.account = account;
        this.money = money;
    }
    @Override
    public void run() {
        synchronized (account) {
            System.out.println(Thread.currentThread().getName()+"取钱开始！");
            account.load(money);
            System.out.println(Thread.currentThread().getName()+"取钱结束！");
        }
    }
}
