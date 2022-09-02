public class X41 {
    public int[] plusTwo(int[] a, int[] b)
    {
    int[] result = new int[a.length + b.length];
    int totalLength = a.length + b.length;
    for (int i = 0; i < a.length; i++){
        result[i] = a[i];
    }
    for (int i = 0; i < b.length; i++){
        result[i + a.length] = b[i];
    }
    return result;
    }
}
