package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static  org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

class PlaybillManagerTest {

    public MovieRepository repository = Mockito.mock(MovieRepository.class);

    private PlaybillManager manager = new PlaybillManager(repository);

    private Movie movie1 = new Movie(1, "Бладшот", "Боевик");
    private Movie movie2 = new Movie(2, "Вперед", "Мультфильм");
    private Movie movie3 = new Movie(3, "Отель Белград", "Комедия");
    private Movie movie4 = new Movie(4, "Джентельмены", "Боевик");
    private Movie movie5 = new Movie(5, "Человек-неведимка", "Ужасы");
    private Movie movie6 = new Movie(6, "Троли. Мировой тур", "Мультфильм");
    private Movie movie7 = new Movie(7, "Номер один", "Комедия");
    private Movie movie8 = new Movie(8, "Первый встречный", "Комедия");
    private Movie movie9 = new Movie(9, "Непослушник", "Комедия");
    private Movie movie10 = new Movie(10, "Падение луны", "Боевик");
    private Movie movie11 = new Movie(11, "Яйцо Фаберже", "Комедия");



    @Test
    void add() {
    }

    @Test
    void getMaxMoviesReverseOrder() {
    }

    @Test
    void testGetMaxMoviesReverseOrder() {
    }
}