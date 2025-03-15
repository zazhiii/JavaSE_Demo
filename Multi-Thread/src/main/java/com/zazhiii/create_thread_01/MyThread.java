package com.zazhiii.create_thread_01;

/**
 * @author zazhi
 * @date 2025/2/15
 * @description: 创建线程的方式一：继承Thread类
 */
// 1. 继承Thread类
public class MyThread extends Thread{

    // 2. 重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("我的线程输出：" + i);
        }
    }
}
