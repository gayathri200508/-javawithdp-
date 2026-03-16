package day5;

import java.util.Arrays;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j-1];
            }
        }

        return dp[n-1];
    }

    public static void main(String[] args) {
        UniquePaths sol = new UniquePaths();

        System.out.println(sol.uniquePaths(3, 7));  
        System.out.println(sol.uniquePaths(3, 2));  
        System.out.println(sol.uniquePaths(1, 1));  
    }
}

