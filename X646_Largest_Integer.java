public class X646_Largest_Integer {
    //Given an array of integers, return the largest value in the array. Assume the array has only posivitive numbers. If the array is empty, return -1.
    int largest(int[] numbers)
    {
    if(numbers.length==0){
        return -1;
    }
    int max = numbers[0];
    for(int i = 0; i < numbers.length; i++) {

        if(numbers[i] > max) {
            max = numbers[i];
        }

    }
    return max;

    }
}
