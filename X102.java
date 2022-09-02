public class X102 {
    public static boolean sameEnds(int[] nums, int n) {
        int[] front = new int[n];
        int[] back = new int[n];
        for (int i = 0; i < n; i++) {
            front[i] = nums[i];

        }
        System.arraycopy(nums, nums.length  - n, back, 0, n);

        while (n-1 >= 0) {
            if (front[n-1] == back[n-1]) {
                n--;
            } else {
                return false;
            }


        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 1};

        System.out.println( X102.sameEnds(nums, 1));

    }
}
