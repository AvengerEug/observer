package com.eugene.sumarry.observerjdk;

import java.util.Observable;
import java.util.Observer;

public class Test {

    public static void main(String[] args) {
        ObservableJDK observableJDK = new ObservableJDK();
        observableJDK.addObserver(new ObserverJDK());
        observableJDK.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("Inner class' update method");
            }
        });

        observableJDK.run();
    }
}
