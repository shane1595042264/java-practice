public class X626 {
    public int countStrLongerThan(String[] names, int minLen)
    {
        int count = 0;
        for (String name : names){
            if(name==null)continue;
            if(name.length() > minLen) count++;
        }
        return count;
    }
}
