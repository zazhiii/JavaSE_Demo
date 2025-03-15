package com.zazhiii.thread_communication;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zazhi
 * @date 2025/2/16
 * @description: TODO
 */
public class Desk {
    private List<String> cakes = new ArrayList<>();

    public synchronized void put() {
        try {
            String name = Thread.currentThread().getName();
            // 判断是否有蛋糕
            if(cakes.isEmpty()){
                cakes.add(name + "坐的蛋糕");
                System.out.println(name + "生产了一个蛋糕");
                Thread.sleep(1000);
                // 等待自己 唤醒消费者
            } else{
                // 有蛋糕
                System.out.println(name + "等待消费者消费蛋糕");
            }
            this.notifyAll();
            this.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void get() {
        try {
            String name = Thread.currentThread().getName();
            // 判断是否有蛋糕
            if(cakes.isEmpty()){
                System.out.println(name + "等待生产者生产蛋糕");
            } else{
                // 有蛋糕
                System.out.println(name + "消费了" + cakes.get(0));
                cakes.clear();
                Thread.sleep(1000);
                // 等待自己 唤醒生产者
            }
            this.notifyAll();
            this.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
