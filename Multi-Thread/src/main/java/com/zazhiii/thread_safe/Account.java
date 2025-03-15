package com.zazhiii.thread_safe;

/**
 * @author zazhi
 * @date 2025/2/16
 * @description: TODO
 */
public class Account {
    // 余额
    double balance;

    public void draw(double drawAmount) {
        if (balance >= drawAmount) {
            System.out.println(Thread.currentThread().getName() + "取钱成功！吐出钞票：" + drawAmount);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance -= drawAmount;
            System.out.println("\t余额为：" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + "取钱失败！余额不足！");
        }
    }

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
