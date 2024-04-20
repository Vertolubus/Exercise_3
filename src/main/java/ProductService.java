//задание 3.1
public class ProductService
{
    public int countByFilter(ConsignmentOfProduct cop, Filter f)
    {
        int count = 0;
        for(int i = 0; i < cop.getProduct().length; i++)
        {
            if(f.apply(cop.getProduct()[i].getName())) count++;
        }
        return count;
    }
}
