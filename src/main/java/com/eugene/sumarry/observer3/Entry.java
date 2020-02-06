package com.eugene.sumarry.observer3;

public class Entry {

    public static void main(String[] args) {
        Person person = new Person();
        Movie movice = new Movie(person);
        Thread threadMovice = new Thread(movice);
        threadMovice.start();
    }
}
