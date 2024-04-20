import static org.junit.Assert.*;
import org.junit.Test;

public class ConsignmentOfProductTest
{
    @Test
    public void testGrossMassConsignment()
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

        ConsignmentOfProduct consignment1 = new ConsignmentOfProduct("Еда", weightProduct3, weightProduct4);
        assertEquals(16, consignment1.grossMassConsignment());

        ConsignmentOfProduct consignment2 = new ConsignmentOfProduct("Еда", pieceProduct1, pieceProduct2, weightProduct3, weightProduct4);
        assertEquals(730, consignment2.grossMassConsignment());
    }
}