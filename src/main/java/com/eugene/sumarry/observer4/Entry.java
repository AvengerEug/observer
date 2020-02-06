package com.eugene.sumarry.observer4;

public class Entry {

    public static void main(String[] args) {
        Person person = new Person(1);
        Movice movice = new Movice(person);
        Thread threadMovice = new Thread(movice);
        threadMovice.start();
    }
}
