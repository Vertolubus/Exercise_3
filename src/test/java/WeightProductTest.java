import static org.junit.Assert.*;
import org.junit.Test;

public class WeightProductTest
{
    @Test
    public void testEquals()
    {
        WeightProduct product1 = new WeightProduct("Сыр", "Обыкновенный");
        WeightProduct product2 = new WeightProduct("Сыр", "Обыкновенный");
        WeightProduct product3 = new WeightProduct("Колбаса", "Необычная");

        assertEquals(true, product1.equals(product2));
        assertEquals(false, product2.equals(product3));
    }

    @Test
    public void testHashCode()
    {
        WeightProduct product1 = new WeightProduct("Сыр", "Обыкновенный");
        WeightProduct product2 = new WeightProduct("Сыр", "Обыкновенный");
        WeightProduct product3 = new WeightProduct("Колбаса", "Необычная");

        assertTrue(product1.hashCode() == product2.hashCode());
        assertFalse(product2.hashCode() == product3.hashCode());
    }

    @Test
    public void testToString()
    {
        WeightProduct product1 = new WeightProduct("Сыр", "Обыкновенный");
        WeightProduct product2 = new WeightProduct("Колбаса", "Необычная");

        String p1 = "Продукт: Сыр; \n Описание: Обыкновенный";
        String p2 = "Продукт: Колбаса; \n Описание: Необычная";

        assertEquals(p1, product1.toString());
        assertEquals(p2, product2.toString());
    }
}