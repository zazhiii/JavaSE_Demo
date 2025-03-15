package com.zazhiii.thread_communication;

/**
 * @author zazhi
 * @date 2025/2/16
 * @description: TODO
 */
public class Main {
    public static void main(String[] args) {
        Desk desk = new Desk();

        new Thread(() -> {
            while (true) {
                desk.put();
            }
        }, "生产者1").start();

        new Thread(() -> {
            while (true) {
                desk.put();
            }
        }, "生产者2").start();

        new Thread(() -> {
            while (true) {
                desk.put();
            }
        }, "生产者3").start();

        new Thread(() -> {
            while (true) {
                desk.get();
            }
        }, "消费者1").start();

        new Thread(() -> {
            while (true) {
                desk.get();
            }
        }, "消费者2").start();
    }
}
