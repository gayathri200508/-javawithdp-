public class UnboundedKnapsack {
    static int UnboundedKnapsack(int[]weights,int[]values,int capacity){
        int n=values.length;
        int[][]dp=new int[n+1][capacity+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=capacity;j++){
                if(weights[i-1]<=j)
                    dp[i][j]=Math.max(values[i-1]+dp[i][j-weights[i-1]],dp[i-1][j]); 
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][capacity];
    }
    public static void main(String args[]){
        int[]weights={1,2,3};
         int[]values={2,3,4};
         int capacity=3;
         int ans=UnboundedKnapsack(weights,values,capacity);
         System.out.println(ans);
    }
}