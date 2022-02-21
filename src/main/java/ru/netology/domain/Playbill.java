package ru.netology.domain;

public class Playbill {

    private int maxMovies = 10;

    private Movie[] movies = new Movie[0];

    public Playbill() {
    }

    public Playbill(int maxMovies) {
        this.maxMovies = maxMovies;
    }

    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }

    public Movie[] showMaxMoviesReverseOrder() {
        Movie[] tmp = new Movie[maxMovies];
        int j = 0;
        for (int i = movies.length - 1; i > (movies.length - 1 - maxMovies); i--) {
            tmp[j] = movies[i];
            j++;
        }
        return tmp;
    }
}
