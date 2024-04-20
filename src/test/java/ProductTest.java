import static org.junit.Assert.*;
import org.junit.Test;

public class ProductTest
{
    @Test
    public void testEquals()
    {
        Product product1 = new Product("Сыр", "Обыкновенный");
        Product product2 = new Product("Сыр", "Обыкновенный");
        Product product3 = new Product("Колбаса", "Необычная");

        assertEquals(true, product1.equals(product2));
        assertEquals(false, product2.equals(product3));
    }

    @Test
    public void testHashCode()
    {
        Product product1 = new Product("Сыр", "Обыкновенный");
        Product product2 = new Product("Сыр", "Обыкновенный");
        Product product3 = new Product("Колбаса", "Необычная");

        assertTrue(product1.hashCode() == product2.hashCode());
        assertFalse(product2.hashCode() == product3.hashCode());
    }

    @Test
    public void testToString()
    {
        Product product1 = new Product("Сыр", "Обыкновенный");
        Product product2 = new Product("Колбаса", "Необычная");

        String p1 = "Продукт: Сыр; \n Описание: Обыкновенный";
        String p2 = "Продукт: Колбаса; \n Описание: Необычная";

        assertEquals(p1, product1.toString());
        assertEquals(p2, product2.toString());
    }
}