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

    public Movie[] getMaxMoviesReverseOrder() {
        Movie[] movies = repository.findAll();
        Movie[] result = new Movie[10];
        int j = 0;
        for (int i = movies.length - 1; i > (movies.length - 11); i--) {
            result[j] = movies[i];
            j++;
        }
        return result;
    }

    public Movie[] getMaxMoviesReverseOrder(int maxMovies) {
        Movie[] movies = repository.findAll();
        Movie[] result = new Movie[maxMovies];
        int j = 0;
        for (int i = movies.length - 1; i > (movies.length - 1 - maxMovies); i--) {
            result[j] = movies[i];
            j++;
        }
        return result;
    }
}
