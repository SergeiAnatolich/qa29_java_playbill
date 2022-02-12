package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static  org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.*;

class PlaybillManagerTest {

    public MoviesRepository repository = Mockito.mock(MoviesRepository.class);

    private PlaybillManager manager = new PlaybillManager(repository);

    private Movies movie1 = new Movies(1, "Бладшот", "Боевик");
    private Movies movie2 = new Movies(2, "Вперед", "Мультфильм");
    private Movies movie3 = new Movies(3, "Отель Белград", "Комедия");
    private Movies movie4 = new Movies(4, "Джентельмены", "Боевик");
    private Movies movie5 = new Movies(5, "Человек-неведимка", "Ужасы");
    private Movies movie6 = new Movies(6, "Троли. Мировой тур", "Мультфильм");
    private Movies movie7 = new Movies(7, "Номер один", "Комедия");
    private Movies movie8 = new Movies(8, "Первый встречный", "Комедия");
    private Movies movie9 = new Movies(9, "Непослушник", "Комедия");
    private Movies movie10 = new Movies(10, "Падение луны", "Боевик");
    private Movies movie11 = new Movies(11, "Яйцо Фаберже", "Комедия");

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