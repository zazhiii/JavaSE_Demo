package com.zazhiii.create_thread_03;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author zazhi
 * @date 2025/2/15
 * @description: TODO
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // 3. 实现Callable接口
        Callable<String> callable = new MyCallable();

        // 4. 创建FutureTask对象(ta实现了Runnable接口)
        FutureTask<String> futureTask = new FutureTask<>(callable);

        // 5. 创建Thread对象
        Thread thread = new Thread(futureTask);

        // 6. 启动线程
        thread.start();

        // 7. 获取线程返回值
        String res = futureTask.get();
        System.out.println(res);
    }
}