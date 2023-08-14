package com.xja.runnables;

import com.xja.domain.Account;

/**
 * 存钱任务
 */
public class SaveRunnable implements Runnable{
    private Account account;//操作的账号对象
    private Double money;//存的金额
    public SaveRunnable(Account account, Double money) {
        this.account = account;
        this.money = money;
    }
    @Override
    public void run() {
        synchronized (account) {
            System.out.println(Thread.currentThread().getName()+"存钱开始！");
            account.save(money);
            System.out.println(Thread.currentThread().getName()+"存钱结束！");
        }
    }
}
