public class X624 {
    public int countStrLongerThan(String[] names, int minLen)
    {
    int count = 0;
    for (String name : names){
        if (name.length() > minLen)
        {
            count += 1;
        }
    }
    return count;
    }

}
