package ru.netology.domain;

public class PlaybillManager {

    private int maxMovies = 10;

    private MovieRepository repository;

    public PlaybillManager() {
    }

    public PlaybillManager(int maxMovies) {
        this.maxMovies = maxMovies;
    }

    public PlaybillManager(MovieRepository repository) {
        this.repository = repository;
    }

    public void add(Movie movie) {
        repository.save(movie);
    }

    public Movie[] getAll() {
        return repository.findAll();
    }

    public Movie[] showMaxMoviesReverseOrder() {
        Movie[] movies = repository.findAll();
        Movie[] tmp = new Movie[maxMovies];
        int j = 0;
        for (int i = movies.length - 1; i > (movies.length - 1 - maxMovies); i--) {
            tmp[j] = movies[i];
            j++;
        }
        return tmp;
    }
}
