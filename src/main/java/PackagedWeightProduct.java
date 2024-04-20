import java.util.Objects;
//задание 1.5 "Упакованный весовой продукт"
public class PackagedWeightProduct extends PackedProduct
{
    private WeightProduct Product;
    //    private ProductPackaging productPackaging;
    private int quantityOfWeightProduct;

    PackagedWeightProduct(WeightProduct wp, ProductPackaging pp, int quantityOfWeightProduct)
    {
        super(pp);
        Product = new WeightProduct(wp.getName(), wp.getDescription());
//      productPackaging = new ProductPackaging(pp.getPackage(), pp.getWeight());
        this.quantityOfWeightProduct = quantityOfWeightProduct;
    }

    public int NetMass()
    {
        return quantityOfWeightProduct;
    }

    public String getName()
    {
        return Product.getName();
    }

    @Override
    public int grossMass()
    {
        return quantityOfWeightProduct + super.pack.getWeight();
    }

    public String toString()
    {
        return String.format("Название продукта: %s \n Описание продукта: %s \n Упаковка: %s \n Вес упаковки: %d \n" +
                " Количество весового товара: %d \n", Product.getName(), Product.getDescription(), super.pack.getPackage(),
                 super.pack.getWeight(), quantityOfWeightProduct);
    }
}
