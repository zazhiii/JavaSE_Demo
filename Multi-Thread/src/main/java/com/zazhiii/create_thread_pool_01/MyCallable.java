package com.zazhiii.create_thread_pool_01;


import java.util.concurrent.Callable;

/**
 * @author zazhi
 * @date 2025/2/15
 * @description: TODO
 */

// 1. Create a class that implements Callable interface
public class MyCallable implements Callable<String> {

    // 2. Override the call() method
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("Callable Thread is running ..." + i);
        }
        return "线程完成了^_^";
    }
}
