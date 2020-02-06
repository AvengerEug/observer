package com.eugene.sumarry.observer4;

import java.util.ArrayList;
import java.util.List;

public class Movie implements Runnable {

    List<MovieEventListener> movieEventListenerList;

    {
        movieEventListenerList = new ArrayList();
    }

    public void addMovieEventListener(MovieEventListener movieEventListener) {
        this.movieEventListenerList.add(movieEventListener);
    }

    @Override
    public void run() {
        try {
            System.out.println("电影开始播放, 3s后进入精彩部分");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MovieEvent movieEvent = new MovieEvent();
        movieEvent.movieType = 1;

        this.notifyListener(movieEvent);

    }

    public void notifyListener(MovieEvent movieEvent) {
        for (MovieEventListener movieEventListener : this.movieEventListenerList) {
            movieEventListener.update(movieEvent);
        }
    }

}
