import org.junit.Test;
import static org.junit.Assert.*;

public class FindWordFilterTest {

    @Test
    public void testApply()
    {
        String str = "Мама мыла раму";
        FindWordFilter filter1 = new FindWordFilter("Мама");
        FindWordFilter filter2 = new FindWordFilter("мыла");
        FindWordFilter filter3 = new FindWordFilter("Арбуз");
        boolean res1 = filter1.apply(str);
        boolean res2 = filter2.apply(str);
        boolean res3 = filter3.apply(str);
        assertEquals(true, res1);
        assertEquals(true, res2);
        assertEquals(false, res3);
    }
}