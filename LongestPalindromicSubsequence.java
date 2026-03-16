package day4;

public class LongestPalindromicSubsequence {
    public int LongestPalindromicSubseq(String s){
        String r = new StringBuilder(s).reverse().toString();
        int n = s.length(), m = r.length();
        int[][] dp = new int[n+1][m+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s.charAt(i-1) == r.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args){
        LongestPalindromicSubsequence obj = new LongestPalindromicSubsequence();
        System.out.println(obj.LongestPalindromicSubseq("bbbab"));  
        System.out.println(obj.LongestPalindromicSubseq("cbbd"));   
    }
}

