package com.eugene.sumarry.observer4;

public class Person extends MoviceEvent {

    public Person(int moviceType) {
        this.moviceType = moviceType;
    }

    @Override
    public void run() {
        wc();
    }

    public void wc() {

        System.out.println(this + " 在" + this.envrionment + "中上厕所");
    }

}
