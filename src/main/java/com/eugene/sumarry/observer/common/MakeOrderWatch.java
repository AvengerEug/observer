package com.eugene.sumarry.observer.common;

import com.eugene.sumarry.observer.observer.MakeOrderObserver;
import com.eugene.sumarry.observer.subject.MakeOrderSubject;

import java.util.ArrayList;
import java.util.List;

/**
 * 将观察者与主题绑定
 */
public class MakeOrderWatch implements MakeOrderSubject {

    private List<MakeOrderObserver> observers;

    {
        observers = new ArrayList<MakeOrderObserver>();
    }


    public void register(MakeOrderObserver makeOrderObserver) {
        observers.add(makeOrderObserver);
    }

    public void remove(MakeOrderObserver makeOrderObserver) {
        observers.remove(makeOrderObserver);
    }

    public void notifyObserver() {
        observers.forEach(observer -> {
            observer.update();
        });
    }
}
