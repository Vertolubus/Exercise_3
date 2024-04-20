import org.junit.Test;
import static org.junit.Assert.*;

public class CompareWordFilterTest
{
    @Test
    public void apply()
    {
        String str = "Мама мыла раму";
        CompareWordFilter filter1 = new CompareWordFilter("Мама");
        CompareWordFilter filter2 = new CompareWordFilter("мыла");
        CompareWordFilter filter3 = new CompareWordFilter("мама мыла раму");
        boolean res1 = filter1.apply(str);
        boolean res2 = filter2.apply(str);
        boolean res3 = filter3.apply(str);

        assertEquals(false, res1);
        assertEquals(false, res2);
        assertEquals(true, res3);
    }
}