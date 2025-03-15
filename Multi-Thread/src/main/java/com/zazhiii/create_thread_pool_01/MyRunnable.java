package com.zazhiii.create_thread_pool_01;

/**
 * @author zazhi
 * @date 2025/2/16
 * @description: TODO
 */
public class MyRunnable implements Runnable {

    // run 方法描述了线程要执行的任务
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
