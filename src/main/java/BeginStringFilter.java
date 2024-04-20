public class BeginStringFilter implements Filter
{
    private String pattern;

    BeginStringFilter(String str)
    {
        pattern = str;
    }

    @Override
    public boolean apply(String str)
    {
        boolean res;
        res = str.startsWith(pattern);
        return res;
    }
}
