package com.zazhiii.wait_sleep_test;

/**
 * @author zazhi
 * @date 2025/3/11
 * @description: TODO
 */
public class Main {

    public static final Object LOCK = new Object();

    public static void main(String[] args) throws InterruptedException {
//        legalWait(); // 正常运行
//        illegalWait(); // 报错：IllegalMonitorStateException: current thread is not owner
//        waiting();
         sleeping();
    }

    // 1. 调用对象的wait()方法，必须获取到对象的锁
    private static void legalWait() throws InterruptedException {
        synchronized(LOCK){
            LOCK.wait();
        }
    }
    private static void illegalWait() throws InterruptedException {
        LOCK.wait();
    }

    /**
     * 执行结果：
     * waiting...  // LOCK 调用 wait() 释放锁
     * other thread get lock // 主线程获取到锁
     * waiting end // 主线程释放锁之后，新线程获取到锁，继续执行
     */
    public static void waiting() throws InterruptedException {
        new Thread(() -> {
            synchronized (LOCK) {
                try {
                    System.out.println("waiting...");
                    LOCK.wait(5000);
                    System.out.println("waiting end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        Thread.sleep(1000);

        synchronized (LOCK) {
            System.out.println("other thread get lock");
        }
    }

    /**
     * 执行结果：
     * sleep...                 // 1. LOCK 调用 sleep() 但是「不释放锁」
     * sleep end                // 2. 5s 后，LOCK 释放锁
     * other thread get lock    // 3. 主线程获取到锁
     */
    public static void sleeping() throws InterruptedException {
        new Thread(() -> {
            synchronized (LOCK) {
                try {
                    System.out.println("sleep...");
                    Thread.sleep(5000);
                    System.out.println("sleep end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        Thread.sleep(1000);

        synchronized (LOCK) {
            System.out.println("other thread get lock");
        }
    }






}
