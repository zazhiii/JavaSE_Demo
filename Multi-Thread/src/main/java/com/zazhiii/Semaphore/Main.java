package com.zazhiii.Semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author zazhi
 * @date 2025/3/16
 * @description: TODO
 */
public class Main {
    public static void main(String[] args) {
        // 1. Semaphore 是一个计数信号量，用来保护一个或多个共享资源的访问
        // 2. 通过 acquire() 获取一个许可，release() 释放一个许可
        // 3. 如果许可不足，acquire() 会阻塞，直到有许可
        // 4. Semaphore 可以用来实现资源池，比如数据库连接池
        Semaphore semaphore = new java.util.concurrent.Semaphore(3);

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + " get semaphore");
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " release semaphore");
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "t" + i).start();
        }
    }
}
