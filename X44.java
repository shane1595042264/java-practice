public class X44 {
    //    Given an int array, return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
    public int sum67(int[] nums) {
        Boolean isIn67 = false;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                isIn67 = true;
                continue;
            }

            else if(isIn67){
                if (nums[i] == 7) {
                    isIn67 = false;
                    continue;
                }
                continue;
            }
            else {
                sum += nums[i];
            }

        }
        return sum;
    }
}
