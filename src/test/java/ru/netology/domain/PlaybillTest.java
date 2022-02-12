package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaybillTest {

    @Test
    public void shouldAddOneMovie() {
        Movies movie = new Movies(1, "Бладшот", "Боевик");

        Playbill playbill = new Playbill();
        playbill.add(movie);

        Movies[] expected = {movie};
        Movies[] actual = playbill.findAll();

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

        Playbill playbill = new Playbill();
        playbill.add(movie1);
        playbill.add(movie2);
        playbill.add(movie3);
        playbill.add(movie4);
        playbill.add(movie5);
        playbill.add(movie6);
        playbill.add(movie7);

        Movies[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        Movies[] actual = playbill.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowMaxMoviesReverseOrder() {
        Movies movie1 = new Movies(1, "Бладшот", "Боевик");
        Movies movie2 = new Movies(2, "Вперед", "Мультфильм");
        Movies movie3 = new Movies(3, "Отель Белград", "Комедия");
        Movies movie4 = new Movies(4, "Джентельмены", "Боевик");
        Movies movie5 = new Movies(5, "Человек-неведимка", "Ужасы");
        Movies movie6 = new Movies(6, "Троли. Мировой тур", "Мультфильм");
        Movies movie7 = new Movies(7, "Номер один", "Комедия");
        Movies movie8 = new Movies(8, "Первый встречный", "Комедия");
        Movies movie9 = new Movies(9, "Непослушник", "Комедия");
        Movies movie10 = new Movies(10, "Падение луны", "Боевик");
        Movies movie11 = new Movies(11, "Яйцо Фаберже", "Комедия");

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

        Movies[] expected = {movie11, movie10, movie9, movie8, movie7};
        Movies[] actual = playbill.showMaxMoviesReverseOrder(5);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowDefaultMoviesReverseOrder() {
        Movies movie1 = new Movies(1, "Бладшот", "Боевик");
        Movies movie2 = new Movies(2, "Вперед", "Мультфильм");
        Movies movie3 = new Movies(3, "Отель Белград", "Комедия");
        Movies movie4 = new Movies(4, "Джентельмены", "Боевик");
        Movies movie5 = new Movies(5, "Человек-неведимка", "Ужасы");
        Movies movie6 = new Movies(6, "Троли. Мировой тур", "Мультфильм");
        Movies movie7 = new Movies(7, "Номер один", "Комедия");
        Movies movie8 = new Movies(8, "Первый встречный", "Комедия");
        Movies movie9 = new Movies(9, "Непослушник", "Комедия");
        Movies movie10 = new Movies(10, "Падение луны", "Боевик");
        Movies movie11 = new Movies(11, "Яйцо Фаберже", "Комедия");

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

        Movies[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        Movies[] actual = playbill.showMaxMoviesReverseOrder();

        assertArrayEquals(expected, actual);
    }
}