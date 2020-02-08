package com.eugene.sumarry.observerjdk;

import java.util.Observable;
import java.util.Observer;

/**
 * jdk的观察者
 */
public class ObserverJDK implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("JDK observable update");
    }
}
