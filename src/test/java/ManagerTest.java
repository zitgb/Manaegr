import org.junit.jupiter.api.Test;
import org.netology.MovieManager;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MovieManagerTest {

    @Test
    void shouldFindAllWnenManagerIsEmpty() {
        MovieManager manager = new MovieManager();

        String[]actual = manager.findAll();

        String[] expected = {} ;

        assertArrayEquals(expected, actual);

    }
    @Test
    void shouldFindAllMoviesInAddingOrder() {
        MovieManager manager = new MovieManager();

      manager.add("Бладшот");
      manager.add("Вперед");
      manager.add("Отель 'Белград'");

        String[] actual = manager.findAll();
        String[] expected = {
                "Бладшот",
                "Вперед",
                "Отель 'Белград'"
        };
        assertArrayEquals(expected, actual);

    }
    @Test
    void shouldFindLastMovies() {
        MovieManager manager = new MovieManager();

        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель 'Белград'");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли");
        manager.add("Номер один");

        String[] actual = manager.findLast();

        String[] expected = {

                "Номер один",
                "Тролли",
                "Человек-невидимка",
                "Джентельмены",
                "Отель 'Белград'",

        };
        assertArrayEquals(expected, actual);

    }

}