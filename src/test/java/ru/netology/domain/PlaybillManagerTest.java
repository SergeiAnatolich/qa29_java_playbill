package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

public class PlaybillManagerTest {

    private MovieRepository repository = Mockito.mock(MovieRepository.class);

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
    public void shouldAdd() {
        Movie[] returned = {movie1, movie2, movie3};
        doReturn(returned).when(repository).findAll();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        Movie[] expected = {movie1, movie2, movie3};
        Movie[] actual = manager.getAll();

        assertArrayEquals(expected, actual);

        verify(repository).findAll();
    }

    @Test
    public void shouldShowMaxMoviesReverseOrder() {
        Movie[] returned = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11};
        doReturn(returned).when(repository).findAll();

        Movie[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        Movie[] actual = manager.showMaxMoviesReverseOrder();

        assertArrayEquals(expected, actual);
    }
}