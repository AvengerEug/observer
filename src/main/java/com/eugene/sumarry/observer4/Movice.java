package com.eugene.sumarry.observer4;

public class Movice implements Runnable {

    MoviceEvent moviceEvent;

    public Movice(MoviceEvent moviceEvent) {
        this.moviceEvent = moviceEvent;
    }

    @Override
    public void run() {
        try {
            System.out.println("电影开始播放, 3s后进入精彩部分");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        moviceEvent.run();
    }

}
