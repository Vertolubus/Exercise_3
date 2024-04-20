import org.junit.Test;
import static org.junit.Assert.*;

public class ProductServiceTest
{
    @Test
    public void testCountByFilter()
    {
        PieceProduct product1 = new PieceProduct("Сыр", "Обычный", 100);
        PieceProduct product2 = new PieceProduct("Колбаса", "Хваленная", 102);

        ProductPackaging package1 = new ProductPackaging("Полиэтилен", 2);
        ProductPackaging package2 = new ProductPackaging("Полиэтилен", 4);

        PackagedPieceProduct pieceProduct1 = new PackagedPieceProduct(product1, package1, 3);
        PackagedPieceProduct pieceProduct2 = new PackagedPieceProduct(product2, package2, 4);

        WeightProduct product3 = new WeightProduct("Конфеты", "Сладкие");
        WeightProduct product4 = new WeightProduct("Креветки", "Замороженные");

        ProductPackaging package3 = new ProductPackaging("Полиэтилен", 3);
        ProductPackaging package4 = new ProductPackaging("Полиэтилен", 5);

        PackagedWeightProduct weightProduct3 = new PackagedWeightProduct(product3, package3, 3);
        PackagedWeightProduct weightProduct4 = new PackagedWeightProduct(product4, package4, 5);

        ConsignmentOfProduct consignment = new ConsignmentOfProduct("Еда", pieceProduct1, pieceProduct2, weightProduct3, weightProduct4);

        BeginStringFilter filter1 = new BeginStringFilter("К");
        BeginStringFilter filter2 = new BeginStringFilter("С");

        ProductService service = new ProductService();

        assertEquals(3, service.countByFilter(consignment,filter1));
        assertEquals(1, service.countByFilter(consignment,filter2));

    }
}