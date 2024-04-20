import java.util.Arrays;
import java.util.Objects;

//задание 1.8 Партия товаров».
public class ConsignmentOfProduct
{
    private String description;
    private PackedProduct[] product;

    ConsignmentOfProduct(String description, PackedProduct ... product)
    {
        this.description = description;
        this.product = new PackedProduct[product.length];
        for (int i = 0; i < product.length; i++)
        {
            this.product[i] = product[i];
        }
    }

    public int grossMassConsignment()
    {
        int grossMass = 0;
        for(int i = 0; i < product.length; i++)
        {
            grossMass += product[i].grossMass();
        }
        return grossMass;
    }

    public String getDescription() {
        return description;
    }

    public PackedProduct[] getProduct() {
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConsignmentOfProduct that)) return false;
        return Objects.equals(getDescription(), that.getDescription()) && Arrays.equals(getProduct(), that.getProduct());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getDescription());
        result = 31 * result + Arrays.hashCode(getProduct());
        return result;
    }

    @Override
    public String toString() {
        return "Описание партии: '" + description + '\'' +
                ", \nНаборы: " + Arrays.toString(product);
    }
}
