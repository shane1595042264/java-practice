public class X47 {
    public int[] withoutTen(int[] nums)
    {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = 0;
        }
        int location = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 10){
                continue;
            }
            else{
                result[location] = nums[i];
                location++;
            }
    }
        return result;
}
