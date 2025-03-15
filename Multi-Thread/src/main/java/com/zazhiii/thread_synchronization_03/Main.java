package com.zazhiii.thread_synchronization_03;

/**
 * @author zazhi
 * @date 2025/2/16
 * @description: TODO
 */
public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        account.balance = 100;
        new DrawThread(account).start();
        new DrawThread(account).start();
    }
}
