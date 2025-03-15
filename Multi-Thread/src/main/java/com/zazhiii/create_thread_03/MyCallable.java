package com.zazhiii.create_thread_03;

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
        String name = Thread.currentThread().getName();
        return name + "线程完成了^_^";
    }
}
