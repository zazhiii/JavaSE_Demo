package com.zazhiii.thread_safe;

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
        Thread draw1 = new DrawThread(account);
        Thread draw2 = new DrawThread(account);
        draw1.start();
        draw2.start();
    }
}
