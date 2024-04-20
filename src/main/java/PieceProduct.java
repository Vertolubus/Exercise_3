import java.util.Objects;
//задание 1.4 "Штучный продукт"
public class PieceProduct extends Product
{
    private int weightOfOnePiece;
    PieceProduct(String n, String d, int w)
    {
        super(n, d);
        weightOfOnePiece = w;
    }

    public int getWeightOfOnePiece() {
        return weightOfOnePiece;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PieceProduct that)) return false;
        if (!super.equals(o)) return false;
        return getWeightOfOnePiece() == that.getWeightOfOnePiece();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWeightOfOnePiece());
    }

    @Override
    public String toString() {
        return String.format("Продукт: %s; \n Описание: %s; \n Вес одной штуки: %d \n", super.getName(), super.getDescription(), weightOfOnePiece);
    }
}
