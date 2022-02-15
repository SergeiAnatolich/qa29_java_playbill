package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaybillTest {

    Movie movie1 = new Movie(1, "Бладшот", "Боевик");
    Movie movie2 = new Movie(2, "Вперед", "Мультфильм");
    Movie movie3 = new Movie(3, "Отель Белград", "Комедия");
    Movie movie4 = new Movie(4, "Джентельмены", "Боевик");
    Movie movie5 = new Movie(5, "Человек-неведимка", "Ужасы");
    Movie movie6 = new Movie(6, "Троли. Мировой тур", "Мультфильм");
    Movie movie7 = new Movie(7, "Номер один", "Комедия");
    Movie movie8 = new Movie(8, "Первый встречный", "Комедия");
    Movie movie9 = new Movie(9, "Непослушник", "Комедия");
    Movie movie10 = new Movie(10, "Падение луны", "Боевик");
    Movie movie11 = new Movie(11, "Яйцо Фаберже", "Комедия");

    @Test
    public void shouldAddOneMovie() {

        Playbill playbill = new Playbill();
        playbill.add(movie1);

        Movie[] expected = {movie1};
        Movie[] actual = playbill.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddSeveralMovies() {
        Playbill playbill = new Playbill();
        playbill.add(movie1);
        playbill.add(movie2);
        playbill.add(movie3);
        playbill.add(movie4);
        playbill.add(movie5);
        playbill.add(movie6);
        playbill.add(movie7);

        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        Movie[] actual = playbill.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowDefaultMaxMoviesReverseOrder() {
        Playbill playbill = new Playbill();
        playbill.add(movie1);
        playbill.add(movie2);
        playbill.add(movie3);
        playbill.add(movie4);
        playbill.add(movie5);
        playbill.add(movie6);
        playbill.add(movie7);
        playbill.add(movie8);
        playbill.add(movie9);
        playbill.add(movie10);
        playbill.add(movie11);

        Movie[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        Movie[] actual = playbill.showMaxMoviesReverseOrder();

        assertArrayEquals(expected, actual);
    }

        @Test
    public void shouldShowMaxMoviesReverseOrder() {
        Playbill playbill = new Playbill(5);
        playbill.add(movie1);
        playbill.add(movie2);
        playbill.add(movie3);
        playbill.add(movie4);
        playbill.add(movie5);
        playbill.add(movie6);
        playbill.add(movie7);
        playbill.add(movie8);
        playbill.add(movie9);
        playbill.add(movie10);
        playbill.add(movie11);

        Movie[] expected = {movie11, movie10, movie9, movie8, movie7};
        Movie[] actual = playbill.showMaxMoviesReverseOrder();

        assertArrayEquals(expected, actual);
    }
}