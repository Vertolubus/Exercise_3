import static org.junit.Assert.*;
import org.junit.Test;

public class PieceProductTest
{
    @Test
    public void testEquals()
    {
        PieceProduct product1 = new PieceProduct("Сыр", "Обычный", 100);
        PieceProduct product2 = new PieceProduct("Сыр", "Обычный", 100);
        PieceProduct product3 = new PieceProduct("Колбаса", "Хваленная", 102);

        assertEquals(true, product1.equals(product2));
        assertEquals(false, product2.equals(product3));
    }

    @Test
    public void testHashCode()
    {
        PieceProduct product1 = new PieceProduct("Сыр", "Обычный", 100);
        PieceProduct product2 = new PieceProduct("Сыр", "Обычный", 100);
        PieceProduct product3 = new PieceProduct("Колбаса", "Хваленная", 102);

        assertTrue(product1.hashCode() == product2.hashCode());
        assertFalse(product2.hashCode() == product3.hashCode());
    }

    @Test
    public void testToString()
    {
        PieceProduct product2 = new PieceProduct("Сыр", "Обычный", 100);
        PieceProduct product3 = new PieceProduct("Колбаса", "Хваленная", 102);

        String p1 = "Продукт: Сыр; \n Описание: Обычный; \n Вес одной штуки: 100 \n";
        String p2 = "Продукт: Колбаса; \n Описание: Хваленная; \n Вес одной штуки: 102 \n";
    }
}