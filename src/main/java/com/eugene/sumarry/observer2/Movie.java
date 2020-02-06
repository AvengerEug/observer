package com.eugene.sumarry.observer2;

public class Movie implements Runnable {

    private volatile boolean isAction;

    @Override
    public void run() {
        try {
            System.out.println("电影开始播放, 3s后进入精彩部分");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.isAction = true;
    }

    public boolean isAction() {
        return this.isAction;
    }


}
