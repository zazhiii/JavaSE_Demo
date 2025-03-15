package com.zazhiii.thread_safe;

/**
 * @author zazhi
 * @date 2025/2/16
 * @description: TODO
 */
public class DrawThread extends Thread {

    private Account account;

    public DrawThread(Account account) {
        this.account = account;
    }

    @Override
    public void run()  {
        account.draw(100);
    }
}
