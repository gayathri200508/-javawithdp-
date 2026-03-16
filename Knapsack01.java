package day3;

public class Knapsack01 {
    public static int knapsack01(int[] weights,int[] values, int capacity){
        int n = values.length;
        int[][] dp = new int[n+1][capacity+1];
        for(int i=1;i<=n;i++){
            for(int j=1; j<=capacity; j++){
                if(weights[i-1] <=j)
                    dp[i][j]=Math.max(values[i-1]+dp[i-1][j-weights[i-1]], dp[i-1][j]);
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][capacity];
    }
    public static void main(String args[]){
        int[] weights = {1,2,3};
        int[] values = {1,3,5};
        int capacity = 3;
        int ans = knapsack01(weights,values,capacity);
        System.out.println(ans);
    }
    
}