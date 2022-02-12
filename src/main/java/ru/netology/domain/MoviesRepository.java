package ru.netology.domain;

public class MoviesRepository {

    private Movies[] movies = new Movies[0];

    public void save(Movies movie) {
        Movies[] tmp = new Movies[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movies[] findAll() {
        return movies;
    }

    public Movies[] findById(int id) {
        Movies[] findMovie = new Movies[1];
        findMovie[0] = null;
        for (Movies movie : movies) {
            if (id == movie.getId()) {
                findMovie[0] = movie;
            }
        }
        return findMovie;
    }

    public void removeById(int id) {
        Movies[] tmp = new Movies[movies.length - 1];
        int index = 0;
        for (Movies movie : movies) {
            if (movie.getId() != id) {
                tmp[index] = movie;
                index++;
            }
        }
        movies = tmp;
    }

    public void removeAll() {
        Movies[] tmp = new Movies[0];
        movies = tmp;
    }
}