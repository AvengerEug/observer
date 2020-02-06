package com.eugene.sumarry.observer2;

public class Entry {

    public static void main(String[] args) {
        Movice movice = new Movice();
        Thread threadMovice = new Thread(movice);
        threadMovice.start();

        Person person = new Person(movice);
        Thread threadPersion = new Thread(person);
        threadPersion.start();

    }
}
