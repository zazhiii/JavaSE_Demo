package com.zazhiii.create_thread_02;

/**
 * @author zazhi
 * @date 2025/2/15
 * @description: TODO
 */
public class Main {

    public static void main(String[] args) {
        // 3. Create an object of MyRunnable
        Runnable target = new MyRunnable();

        // 4. Create an object of Thread and pass the object of MyRunnable to it
        Thread thread = new Thread(target);

        // 5. Start the thread
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main Thread is running ..." + i);
        }

        // ================================

        // 简化形式1
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 1 is running ..." + i);
                }
            }
        }).start();

        // 简化形式2
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2 is running ..." + i);
            }
        }).start();
    }
}
