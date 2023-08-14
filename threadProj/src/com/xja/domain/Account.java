package com.xja.domain;

public class Account {
    private Double money;//余额

    public Account(Double money) {
        this.money = money;
    }

    public void save(double m){
        double t = m + money ;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.money = t;
    }

    public void load(double m){
        double t = money - m;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.money = t;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                '}';
    }
}
