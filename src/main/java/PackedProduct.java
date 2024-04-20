public class PackedProduct
{
    ProductPackaging pack;
    PackedProduct(ProductPackaging pp)
    {
        pack = pp;
    }
    public ProductPackaging getPack()
    {
        return pack;
    }

    public String getName()
    {
        return "";
    }

    public int grossMass()
    {
        return 0;
    }
}
