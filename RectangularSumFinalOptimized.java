import java.util.Scanner;
public class RectangularSumFinalOptimized {


    // static


    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;

        for(int i = l1; i <= l2; i++) {
            for(int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // prefix sum row-wise
    static void findPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        // traverse horizontally to calculate row-wise sum
        for(int i = 0; i < r; i++) {
            for(int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }

    // prefix sum column-wise



    static int findSumOptimized(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;
        findPrefixSumMatrix(matrix);

        for(int i = l1; i <= l2; i++) {
            // r1 to r2 sum for row i
            if(r1 >= 1)
                sum += matrix[i][r2] - matrix[i][r1-1];
            else
                sum += matrix[i][r2]; 
        }
        return sum;
    }

    static int findSumFinalOptimized(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;
        
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size n*n: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter " + n*n + " values:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rectangle boundaries l1, r1, l2, r2 rispectively: ");
        int l1 = sc.nextInt();               
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle sum: " + findSum(matrix, l1, r1, l2, r2));
        System.out.println("Rectangle sum Optimized: " + findSumOptimized(matrix, l1, r1, l2, r2));        

        sc.close();
    }
}