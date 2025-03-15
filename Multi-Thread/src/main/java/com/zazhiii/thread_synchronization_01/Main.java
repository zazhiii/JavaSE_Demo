package com.zazhiii.thread_synchronization_01;

/**
 * @author zazhi
 * @date 2025/2/16
 * @description: TODO
 */
public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        account.balance = 100;
        // 创建两个线程
        new DrawThread(account).start();
        new DrawThread(account).start();

        // 另一个账户
        Account account2 = new Account();
        account2.balance = 100;
        new DrawThread(account2).start();
        new DrawThread(account2).start();

    }
}
