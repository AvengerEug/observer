package com.eugene.sumarry.observerjdk;

import java.util.Observable;

/**
 * 被观察者
 */
public class ObservableJDK extends Observable {

    public void run() {

        setChanged();
        notifyObservers();
    }
}
