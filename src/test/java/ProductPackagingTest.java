import static org.junit.Assert.*;
import org.junit.Test;

public class ProductPackagingTest
{
    @Test
    public void testEquals()
    {
        ProductPackaging product1 = new ProductPackaging("Сыр", 100);
        ProductPackaging product2 = new ProductPackaging("Колбаса", 101);
        ProductPackaging product3 = new ProductPackaging("Сыр", 100);

        assertEquals(false, product1.equals(product2));
        assertEquals(true, product1.equals(product3));
    }

    @Test
    public void testHashCode()
    {
        ProductPackaging product1 = new ProductPackaging("Сыр", 100);
        ProductPackaging product2 = new ProductPackaging("Колбаса", 101);
        ProductPackaging product3 = new ProductPackaging("Сыр", 100);

        assertTrue(product1.hashCode() == product3.hashCode());
        assertFalse(product1.hashCode() == product2.hashCode());
    }

    @Test
    public void testToString()
    {
        ProductPackaging product1 = new ProductPackaging("Пакет", 2);
        ProductPackaging product2 = new ProductPackaging("Колбаса", 101);

        String p1 = "Упаковка: Сыр; \n Вес: 100";
        String p2 = "Упаковка: Колбаса; \n Вес: 101";

        String test = "Упаковка: Пакет; \n Вес: 2";
        assertEquals(test, product1.toString());
    }
}