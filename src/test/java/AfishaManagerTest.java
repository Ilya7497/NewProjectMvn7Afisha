import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

public class AfishaManagerTest {
    AfishaManager manager = new AfishaManager();
    CoverItem item1 = new CoverItem("Бладшот");
    CoverItem item2 = new CoverItem("Вперёд");
    CoverItem item3 = new CoverItem("Отель \"Белград\"");
    CoverItem item4 = new CoverItem("Джентельмены");
    CoverItem item5 = new CoverItem("Человек-невидимка");
    CoverItem item6 = new CoverItem("Тролли.Мировой тур");
    CoverItem item7 = new CoverItem("Номер один");
    @BeforeEach
    public void setup() {
        manager.saveCover(item1);
        manager.saveCover(item2);
        manager.saveCover(item3);
        manager.saveCover(item4);
        manager.saveCover(item5);
        manager.saveCover(item6);
        manager.saveCover(item7);
    }

    @Test
    public void saveCover() {

        CoverItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        CoverItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void findAllCOver() {

        CoverItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        CoverItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast() {

        CoverItem[] expected = {item7, item6, item5, item4, item3, item2, item1};
        CoverItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
