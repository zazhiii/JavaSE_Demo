package com.zazhiii.ThreadLocal;

/**
 * @author zazhi
 * @date 2025/3/16
 * @description: TODO
 */
public class Main {

    static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set("mainValue");
        System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
        threadLocal.remove();
        System.out.println(Thread.currentThread().getName() + "-removed: " + threadLocal.get());

        new Thread(() -> {
            threadLocal.set("t1Value");
            System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
            threadLocal.remove();
            System.out.println(Thread.currentThread().getName() + "-removed: " + threadLocal.get());
        }, "t1").start();

        new Thread(() -> {
            threadLocal.set("t2Value");
            System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
            threadLocal.remove();
            System.out.println(Thread.currentThread().getName() + "-removed: " + threadLocal.get());
        }, "t2").start();
    }
}
