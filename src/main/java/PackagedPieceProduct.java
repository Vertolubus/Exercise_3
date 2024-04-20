import java.util.Objects;
//задание 1.6 "Упакованный штучный продукт"
public class PackagedPieceProduct extends PackedProduct
{
    private PieceProduct pieceProduct;
    //    private ProductPackaging productPackaging;
    private int quantityOfPieceProduct;

    PackagedPieceProduct(PieceProduct pieceProduct, ProductPackaging pp, int quantityOfPieceProduct)
    {
        super(pp);
        this.pieceProduct = new PieceProduct(pieceProduct.getName(), pieceProduct.getDescription(), pieceProduct.getWeightOfOnePiece());
//        this.productPackaging = new ProductPackaging(productPackaging.getPackage(), productPackaging.getWeight());
        this.quantityOfPieceProduct = quantityOfPieceProduct;
    }

    public String getName()
    {
        return pieceProduct.getName();
    }

    public int getQuantityOfPieceProduct()
    {
        return quantityOfPieceProduct;
    }

    public int netMass()
    {
        return quantityOfPieceProduct * pieceProduct.getWeightOfOnePiece();
    }

    @Override
    public int grossMass()
    {
        return netMass() + super.pack.getWeight();
    }

    public String toString()
    {
        return String.format("Название продукта: %s \n Описание продукта: %s \n Вес одной единицы продукта: %d \n Упаковка: %s \n Вес упаковки: %d \n" +
                        " Количество товара: %d \n", pieceProduct.getName(), pieceProduct.getDescription(), pieceProduct.getWeightOfOnePiece(), super.pack.getPackage(),
                super.pack.getWeight(), quantityOfPieceProduct);
    }

}
