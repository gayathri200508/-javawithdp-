package day2;

class HouseRobber1 {

    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        int[] dp = new int[n];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {

            int case1 = dp[i - 2] + nums[i];
            int case2 = dp[i - 1];

            dp[i] = Math.max(case1, case2);
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {

        HouseRobber1 obj = new HouseRobber1();

        int[] nums = {2, 7, 9, 3, 1};

        int result = obj.rob(nums);

        System.out.println("Maximum money robbed: " + result);
    }
}
