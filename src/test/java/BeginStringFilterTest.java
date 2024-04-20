import static org.junit.Assert.*;
import org.junit.Test;

public class BeginStringFilterTest
{
    @Test
    public void testApply()
    {
        String str = "Мама мыла раму";
        BeginStringFilter filter1 = new BeginStringFilter("Мама");
        BeginStringFilter filter2 = new BeginStringFilter("мыла");
        boolean res1 = filter1.apply(str); // результат — true
        boolean res2 = filter2.apply(str); // результат — false
        assertEquals(true, res1);
        assertEquals(false, res2);
    }
}