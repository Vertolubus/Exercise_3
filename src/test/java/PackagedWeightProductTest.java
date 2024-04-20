import static org.junit.Assert.*;
import org.junit.Test;

public class PackagedWeightProductTest
{
    @Test
    public void testGetNetMass()
    {
        WeightProduct product1 = new WeightProduct("Сыр", "Обыкновенный");
        ProductPackaging product2 = new ProductPackaging("Сыр", 100);
        PackagedWeightProduct packagedWeightProduct = new PackagedWeightProduct(product1, product2, 3);

        assertEquals(3, packagedWeightProduct.NetMass());
    }

    @Test
    public void testGrossWeight()
    {
        WeightProduct product1 = new WeightProduct("Сыр", "Обыкновенный");
        ProductPackaging product2 = new ProductPackaging("Сыр", 100);
        PackagedWeightProduct packagedWeightProduct = new PackagedWeightProduct(product1, product2, 3);

        assertEquals(103, packagedWeightProduct.grossMass());
    }

    @Test
    public void testToString()
    {
        WeightProduct product1 = new WeightProduct("Сыр", "Обыкновенный");
        ProductPackaging product2 = new ProductPackaging("Сыр", 100);
        PackagedWeightProduct packagedWeightProduct = new PackagedWeightProduct(product1, product2, 3);

        String test = "Название продукта: Сыр \n Описание продукта: Обыкновенный \n Упаковка: Сыр \n Вес упаковки: 100 \n Количество весового товара: 3 \n";
        assertEquals(test, packagedWeightProduct.toString());
    }
}