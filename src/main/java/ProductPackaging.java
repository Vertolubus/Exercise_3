import java.util.Objects;
//задание 1.1 "Упаковка товара"
public class ProductPackaging
{
    private String Package;
    int weight;

    ProductPackaging(String name, int w)
    {
        Package = name;
        weight = w;
    }

    public String getPackage() {
        return Package;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductPackaging that)) return false;
        return getWeight() == that.getWeight() && Objects.equals(getPackage(), that.getPackage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPackage(), getWeight());
    }

    @Override
    public String toString() {
        return String.format("Упаковка: %s; \n Вес: %s", Package, weight);
    }
}

