package com.zazhiii.create_thread_pool_02;

import java.util.concurrent.Executors;

/**
 * @author zazhi
 * @date 2025/2/16
 * @description: TODO
 */
public class Main {

    // Executors 是一个工具类，提供了一系列工厂方法用于创建线程池

    public static void main(String[] args) {
        Executors.newFixedThreadPool(3);
    }
}
