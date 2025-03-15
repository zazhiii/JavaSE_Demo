package com.zazhiii.thread_synchronization_03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zazhi
 * @date 2025/2/16
 * @description: TODO
 */
public class Account {
    double balance;

    // 创建锁对象
    private final Lock lock = new ReentrantLock();

    public void draw(double drawAmount) {

        // 加锁
        lock.lock();

        if (balance >= drawAmount) {
            System.out.println(Thread.currentThread().getName() + "取钱成功！吐出钞票：" + drawAmount);
            balance -= drawAmount;
            System.out.println("\t余额为：" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + "取钱失败！余额不足！");
        }

        // 释放锁
        lock.unlock();

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
