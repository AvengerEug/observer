package com.eugene.sumarry.observer4;

public class PersonA implements MovieEventListener {

    @Override
    public void update(MovieEvent movieEvent) {
        if (movieEvent.movieType == 1) {
            System.out.println("PersionA 哭泣");
        }
    }
}
