public class X2 {

    //Write a function in Java that implements the following logic: Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
    public boolean lessBy10(int a, int b, int c)
    {


        int diff1 = Math.abs(a - b);
        int diff2 = Math.abs(c - a);
        int diff3 = Math.abs(c - b);
        if(diff1 >= 10) return true;

        if(diff2 >= 10) return true;
        if(diff3 >= 10) return true;
        return false;
    }
}
