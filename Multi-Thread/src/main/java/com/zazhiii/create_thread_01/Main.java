package com.zazhiii.create_thread_01;

/**
 * @author zazhi
 * @date 2025/2/15
 * @description: Main
 */
public class Main {
    // 主线程
    public static void main(String[] args) {
        // 3. 创建线程对象
        Thread t = new MyThread();
        // 4. 启动线程
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出：" + i);
        }
    }
}
