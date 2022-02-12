package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviesRepositoryTest {

    @Test
    public void shouldAddOneMovie() {
        Movies movie = new Movies(1, "Бладшот", "Боевик");

        MoviesRepository repo = new MoviesRepository();
        repo.save(movie);

        Movies[] expected = {movie};
        Movies[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdd() {
        Movies movie1 = new Movies(1, "Бладшот", "Боевик");
        Movies movie2 = new Movies(2, "Вперед", "Мультфильм");
        Movies movie3 = new Movies(3, "Отель Белград", "Комедия");
        Movies movie4 = new Movies(4, "Джентельмены", "Боевик");
        Movies movie5 = new Movies(5, "Человек-неведимка", "Ужасы");
        Movies movie6 = new Movies(6, "Троли. Мировой тур", "Мультфильм");
        Movies movie7 = new Movies(7, "Номер один", "Комедия");

        MoviesRepository repo = new MoviesRepository();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);
        repo.save(movie5);
        repo.save(movie6);
        repo.save(movie7);

        Movies[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        Movies[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindById() {
        Movies movie1 = new Movies(1, "Бладшот", "Боевик");
        Movies movie2 = new Movies(2, "Вперед", "Мультфильм");
        Movies movie3 = new Movies(3, "Отель Белград", "Комедия");
        Movies movie4 = new Movies(4, "Джентельмены", "Боевик");
        Movies movie5 = new Movies(5, "Человек-неведимка", "Ужасы");

        MoviesRepository repo = new MoviesRepository();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);
        repo.save(movie5);

        Movies[] expected = {movie3};
        Movies[] actual = repo.findById(3);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        Movies movie1 = new Movies(1, "Бладшот", "Боевик");
        Movies movie2 = new Movies(2, "Вперед", "Мультфильм");
        Movies movie3 = new Movies(3, "Отель Белград", "Комедия");

        MoviesRepository repo = new MoviesRepository();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);

        repo.removeById(2);

        Movies[] expected = {movie1, movie3};
        Movies[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveAll() {
        Movies movie1 = new Movies(1, "Бладшот", "Боевик");
        Movies movie2 = new Movies(2, "Вперед", "Мультфильм");
        Movies movie3 = new Movies(3, "Отель Белград", "Комедия");

        MoviesRepository repo = new MoviesRepository();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);

        repo.removeAll();

        Movies[] expected = {};
        Movies[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }
}