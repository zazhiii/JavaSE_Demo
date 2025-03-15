package com.zazhiii.create_thread_pool_01;

import com.zazhiii.create_thread_03.MyCallable;

import java.util.concurrent.*;

/**
 * @author zazhi
 * @date 2025/2/16
 * @description: TODO
 */
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        processCallable();
    }

    /**
     * 线程池处理Runnable任务
     */
    public static void processRunnable() {
        // 1. 创建线程池方式一
        ExecutorService pool = new ThreadPoolExecutor(
                3,    //核心线程数有3个
                5,  //最大线程数有5个。   临时线程数=最大线程数-核心线程数=5-3=2
                8,    //临时线程存活的时间8秒。 意思是临时线程8秒没有任务执行，就会被销毁掉。
                TimeUnit.SECONDS,//时间单位（秒）
                new ArrayBlockingQueue<>(4), //任务阻塞队列，没有来得及执行的任务在，任务队列中等待
                Executors.defaultThreadFactory(), //用于创建线程的工厂对象
                new ThreadPoolExecutor.CallerRunsPolicy() //拒绝策略
        );

        Runnable target = new MyRunnable();

        pool.execute(target); // 核心线程处理
        pool.execute(target); // 核心线程处理
        pool.execute(target); // 核心线程处理
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        // 核心线程都在忙，任务队列已满到临时线程创建时机了
        pool.execute(target);
        pool.execute(target);
        // 临时线程都在忙，最大线程数已满到拒绝策略了
        pool.execute(target);
    }

    /**
     * 线程池处理Callable任务
     */
    public static void processCallable() throws ExecutionException, InterruptedException {
        // 1. 创建线程池方式一
        ExecutorService pool = new ThreadPoolExecutor(
                3,    //核心线程数有3个
                5,  //最大线程数有5个。   临时线程数=最大线程数-核心线程数=5-3=2
                8,    //临时线程存活的时间8秒。 意思是临时线程8秒没有任务执行，就会被销毁掉。
                TimeUnit.SECONDS,//时间单位（秒）
                new ArrayBlockingQueue<>(4), //任务阻塞队列，没有来得及执行的任务在，任务队列中等待
                Executors.defaultThreadFactory(), //用于创建线程的工厂对象
                new ThreadPoolExecutor.CallerRunsPolicy() //拒绝策略
        );

        Callable<String> target = new MyCallable();

        Future<String> future1 = pool.submit(target); // 核心线程处理
        Future<String> future2 = pool.submit(target); // 核心线程处理
        Future<String> future3 = pool.submit(target); // 核心线程处理
        Future<String> future4 = pool.submit(target);
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
        System.out.println(future4.get());
    }
}
