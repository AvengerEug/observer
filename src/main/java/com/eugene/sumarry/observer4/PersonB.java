package com.eugene.sumarry.observer4;

public class PersonB implements MovieEventListener {

    @Override
    public void update(MovieEvent movieEvent) {
        if (movieEvent.movieType == 1) {
            System.out.println("PersionB 笑哈哈");
        }
    }
}
