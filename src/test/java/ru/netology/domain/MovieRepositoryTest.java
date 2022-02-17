package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieRepositoryTest {

    @Test
    public void shouldAddOneMovie() {
        Movie movie = new Movie(1, "Бладшот", "Боевик");

        MovieRepository repo = new MovieRepository();
        repo.save(movie);

        Movie[] expected = {movie};
        Movie[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdd() {
        Movie movie1 = new Movie(1, "Бладшот", "Боевик");
        Movie movie2 = new Movie(2, "Вперед", "Мультфильм");
        Movie movie3 = new Movie(3, "Отель Белград", "Комедия");
        Movie movie4 = new Movie(4, "Джентельмены", "Боевик");
        Movie movie5 = new Movie(5, "Человек-неведимка", "Ужасы");
        Movie movie6 = new Movie(6, "Троли. Мировой тур", "Мультфильм");
        Movie movie7 = new Movie(7, "Номер один", "Комедия");

        MovieRepository repo = new MovieRepository();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);
        repo.save(movie5);
        repo.save(movie6);
        repo.save(movie7);

        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        Movie[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindById() {
        Movie movie1 = new Movie(1, "Бладшот", "Боевик");
        Movie movie2 = new Movie(2, "Вперед", "Мультфильм");
        Movie movie3 = new Movie(9, "Отель Белград", "Комедия");
        Movie movie4 = new Movie(4, "Джентельмены", "Боевик");
        Movie movie5 = new Movie(5, "Человек-неведимка", "Ужасы");

        MovieRepository repo = new MovieRepository();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);
        repo.save(movie5);

        Movie[] expected = {movie3};
        Movie[] actual = repo.findById(9);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindById() {
        Movie movie1 = new Movie(1, "Бладшот", "Боевик");
        Movie movie2 = new Movie(2, "Вперед", "Мультфильм");

        MovieRepository repo = new MovieRepository();
        repo.save(movie1);
        repo.save(movie2);

        Movie[] expected = null;
        Movie[] actual = repo.findById(3);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        Movie movie1 = new Movie(1, "Бладшот", "Боевик");
        Movie movie2 = new Movie(7, "Вперед", "Мультфильм");
        Movie movie3 = new Movie(3, "Отель Белград", "Комедия");

        MovieRepository repo = new MovieRepository();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);

        repo.removeById(7);

        Movie[] expected = {movie1, movie3};
        Movie[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotRemoveById() {
        Movie movie1 = new Movie(1, "Бладшот", "Боевик");
        Movie movie2 = new Movie(7, "Вперед", "Мультфильм");

        MovieRepository repo = new MovieRepository();
        repo.save(movie1);
        repo.save(movie2);

        repo.removeById(3);

        Movie[] expected = {movie1, movie2};
        Movie[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveAll() {
        Movie movie1 = new Movie(1, "Бладшот", "Боевик");
        Movie movie2 = new Movie(2, "Вперед", "Мультфильм");
        Movie movie3 = new Movie(3, "Отель Белград", "Комедия");

        MovieRepository repo = new MovieRepository();
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);

        repo.removeAll();

        Movie[] expected = {};
        Movie[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }
}