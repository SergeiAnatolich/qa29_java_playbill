package ru.netology.domain;

public class PlaybillManager {

    private MoviesRepository repository;

    public PlaybillManager(MoviesRepository repository) {
        this.repository=repository;
    }

    public void add(Movies movie) {
        repository.save(movie);
    }

    public Movies[] getAll() {
        return repository.findAll();
    }

    public Movies[] getMaxMoviesReverseOrder() {
        Movies[] movies = repository.findAll();
        Movies[] result = new Movies[10];
        int j = 0;
        for (int i = movies.length - 1; i > (movies.length - 11); i--) {
            result[j] = movies[i];
            j++;
        }
        return result;
    }

    public Movies[] getMaxMoviesReverseOrder(int maxMovies) {
        Movies[] movies = repository.findAll();
        Movies[] result = new Movies[maxMovies];
        int j = 0;
        for (int i = movies.length - 1; i > (movies.length - 1 - maxMovies); i--) {
            result[j] = movies[i];
            j++;
        }
        return result;
    }
}
