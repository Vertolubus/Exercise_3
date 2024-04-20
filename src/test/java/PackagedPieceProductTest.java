import static org.junit.Assert.*;
import org.junit.Test;

public class PackagedPieceProductTest
{
    @Test
    public void testGetNetMass()
    {
        PieceProduct product1 = new PieceProduct("Сыр", "Обычный", 100);
        PieceProduct product2 = new PieceProduct("Колбаса", "Хваленная", 102);

        ProductPackaging package1 = new ProductPackaging("Полиэтилен", 2);
        ProductPackaging package2 = new ProductPackaging("Полиэтилен", 4);

        PackagedPieceProduct pieceProduct1 = new PackagedPieceProduct(product1, package1, 12);
        PackagedPieceProduct pieceProduct2 = new PackagedPieceProduct(product2, package2, 4);

        assertEquals(1200, pieceProduct1.netMass());
        assertEquals(408, pieceProduct2.netMass());
    }

    @Test
    public void testGetGrossWeight()
    {
        PieceProduct product1 = new PieceProduct("Сыр", "Обычный", 100);
        PieceProduct product2 = new PieceProduct("Колбаса", "Хваленная", 102);

        ProductPackaging package1 = new ProductPackaging("Полиэтилен", 2);
        ProductPackaging package2 = new ProductPackaging("Полиэтилен", 4);

        PackagedPieceProduct pieceProduct1 = new PackagedPieceProduct(product1, package1, 12);
        PackagedPieceProduct pieceProduct2 = new PackagedPieceProduct(product2, package2, 4);

        assertEquals(1202, pieceProduct1.grossMass());
        assertEquals(412, pieceProduct2.grossMass());
    }

    @Test
    public void testToString()
    {
        PieceProduct product1 = new PieceProduct("Сыр", "Обычный", 100);

        ProductPackaging package1 = new ProductPackaging("Полиэтилен", 2);

        PackagedPieceProduct pieceProduct1 = new PackagedPieceProduct(product1, package1, 12);

        String test = "Название продукта: Сыр \n Описание продукта: Обычный \n Вес одной единицы продукта: 100 \n Упаковка: Полиэтилен \n Вес упаковки: 2 \n Количество товара: 12 \n";
        assertEquals(test, pieceProduct1.toString());
    }
}