package com.eugene.sumarry.observer2;

public class Entry {

    public static void main(String[] args) {
        Movie movice = new Movie();
        Thread threadMovice = new Thread(movice);
        threadMovice.start();

        Person person = new Person(movice);
        Thread threadPersion = new Thread(person);
        threadPersion.start();

    }
}
