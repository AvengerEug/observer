package com.eugene.sumarry.observer2;

public class Person implements Runnable {

    private Movie movice;

    public Person(Movie movice) {
        this.movice = movice;
    }

    @Override
    public void run() {
        System.out.println("PersonA 开始看电影");
        while(true) {
            if (movice.isAction()) {
                wc();
                break;
            }
        }

    }

    public void wc() {
        System.out.println("PersonA goto wc");
    }


}
