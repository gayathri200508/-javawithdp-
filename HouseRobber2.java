public class HouseRobber2 {

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        return Math.max(
            robLinear(nums, 0, nums.length - 2),
            robLinear(nums, 1, nums.length - 1)
        );
    }

    private int robLinear(int[] nums, int start, int end) {
        int prev2 = 0, prev1 = 0;
        for (int i = start; i <= end; i++) {
            int temp = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = temp;
        }
        return prev1;
    }

    public static void main(String[] args) {
        HouseRobber2 solution = new HouseRobber2();

        System.out.println(solution.rob(new int[]{2, 3, 2}));    
        System.out.println(solution.rob(new int[]{1, 2, 3, 1})); 
        System.out.println(solution.rob(new int[]{1, 2, 3}));    
    }
}
