package ru.netology.domain;

public class MovieRepository {

    private Movie[] movie = new Movie[0];

    public void save(Movie movie) {
        Movie[] tmp = new Movie[this.movie.length + 1];
        System.arraycopy(this.movie, 0, tmp, 0, this.movie.length);
        tmp[tmp.length - 1] = movie;
        this.movie = tmp;
    }

    public Movie[] findAll() {
        return movie;
    }

    public Movie[] findById(int id) {
        Movie[] findMovie = new Movie[1];
        findMovie[0] = null;
        for (Movie movie : movie) {
            if (id == movie.getId()) {
                findMovie[0] = movie;
            }
        }
        return findMovie;
    }

    public void removeById(int id) {
        Movie[] nullFilm = new Movie[1];
        nullFilm[0] = null;
        if (findById(id)[0] != nullFilm[0]) {
            Movie[] tmp = new Movie[movie.length - 1];
            int index = 0;
            for (Movie movie : movie) {
                if (movie.getId() != id) {
                    tmp[index] = movie;
                    index++;
                }
            }
            movie = tmp;
        }
    }

    public void removeAll() {
        movie = new Movie[0];
    }
}