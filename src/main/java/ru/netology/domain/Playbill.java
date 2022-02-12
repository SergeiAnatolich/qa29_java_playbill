package ru.netology.domain;

public class Playbill {

    private Movies[] movies = new Movies[0];

    public void add(Movies movie) {
        int length = movies.length + 1;
        Movies[] tmp = new Movies[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movies[] findAll() {
        return movies;
    }

    public Movies[] showMaxMoviesReverseOrder(int maxMovies) {
        Movies[] tmp = new Movies[maxMovies];
        int j = 0;
        for (int i = movies.length - 1; i > (movies.length - 1 - maxMovies); i--) {
            tmp[j] = movies[i];
            j++;
        }
        return tmp;
    }

    public Movies[] showMaxMoviesReverseOrder() {
        Movies[] tmp = new Movies[10];
        int j = 0;
        for (int i = movies.length - 1; i > (movies.length - 11); i--) {
            tmp[j] = movies[i];
            j++;
        }
        return tmp;
    }
}
