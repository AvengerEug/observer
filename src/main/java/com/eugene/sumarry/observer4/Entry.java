package com.eugene.sumarry.observer4;

public class Entry {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.addMovieEventListener(new PersonA());
        movie.addMovieEventListener(new PersonB());
        Thread threadMovie = new Thread(movie);
        threadMovie.start();
    }
}
