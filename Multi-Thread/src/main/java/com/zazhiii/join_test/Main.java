package com.zazhiii.join_test;

/**
 * @author zazhi
 * @date 2025/3/11
 * @description: TODO
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> System.out.println("Thread1"));

        Thread t2 = new Thread(() -> {
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread2");
        });

        Thread t3 = new Thread(() -> {
            try {
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread3");
        });

        t1.wait();

        t1.start();
        t2.start();
        t3.start();

    }
}
