package com.zazhiii.create_thread_02;

/**
 * @author zazhi
 * @date 2025/2/15
 * @description: TODO
 */
// 1. Implement the Runnable interface
public class MyRunnable implements Runnable{

    // 2. Override the run() method
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("my Thread is running ..." + i);
        }
    }
}
