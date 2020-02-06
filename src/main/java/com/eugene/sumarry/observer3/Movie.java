package com.eugene.sumarry.observer3;

public class Movie implements Runnable {

    private Person person;

    public Movie(Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        try {
            System.out.println("电影开始播放, 3s后进入精彩部分");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        person.wc();
    }

}
