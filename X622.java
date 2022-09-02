public class X622 {
    public int getElementAt(int[] numbers, int nth, int notFound)
    {
        try {
            return numbers[nth];
        }catch(ArrayIndexOutOfBoundsException e) {
    return notFound;
        }
    }
}
