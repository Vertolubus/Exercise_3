import java.util.Objects;
//задание 1.2 "Продукт"
public class Product
{
    private String name;
    private String description;

    Product(String n, String d)
    {
        name = n;
        description = d;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(getName(), product.getName()) && Objects.equals(getDescription(), product.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescription());
    }

    @Override
    public String toString() {
        return String.format("Продукт: %s; \n Описание: %s", name, description);
    }
}
