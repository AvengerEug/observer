package com.eugene.sumarry.observer2;

public class Person implements Runnable {

    private Movice movice;

    public Person(Movice movice) {
        this.movice = movice;
    }

    @Override
    public void run() {
        System.out.println("Person 开始看电影");
        while(true) {
            if (movice.isAction()) {
                wc();
                break;
            }
        }

    }

    public void wc() {
        System.out.println("Person goto wc");
    }


}
