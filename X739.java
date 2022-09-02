public class X739 {
    public String getElementAt(ArrayList<String> contents, int nth)
    {
        if(contents.size() <= nth)
            return null;
        return contents.get(nth);
    }
}
