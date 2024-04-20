public class CompareWordFilter implements Filter
{
    private String pattern;

    CompareWordFilter(String str)
    {
        pattern = str;
    }

    @Override
    public boolean apply(String str)
    {
        boolean res;
        res = str.equalsIgnoreCase(pattern);
        return res;
    }
}
