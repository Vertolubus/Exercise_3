public class FindWordFilter implements Filter
{
    private String pattern;

    FindWordFilter(String str)
    {
        pattern = str;
    }

    @Override
    public boolean apply(String str)
    {
        boolean res;
        res = str.contains(pattern);
        return res;
    }
}
