public class X492 {
    public String repeatFront(String str, int n)
    {
    String result = "";
    while(n>=0){
        result += str.substring(0, n);
        n--;
    }
    return result;
    }
}
