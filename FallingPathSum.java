import java.util.Arrays;

public class FallingPathSum {
    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        
        for (int row = 1; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int best = matrix[row-1][col];
                if (col > 0) best = Math.min(best, matrix[row-1][col-1]);
                if (col < n-1) best = Math.min(best, matrix[row-1][col+1]);
                matrix[row][col] += best;
            }
        }
        
        return Arrays.stream(matrix[n-1]).min().getAsInt();
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{2,1,3},{6,5,4},{7,8,9}};
        int[][] matrix2 = {{-19,57},{-40,-5}};

        System.out.println("Output 1 → " + minFallingPathSum(matrix1));
        System.out.println("Expected → 13");
        System.out.println("Output 2 → " + minFallingPathSum(matrix2));
        System.out.println("Expected → -59");
    }
}