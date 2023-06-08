import java.util.Scanner;
public class PascalTriangle {

    static void printMatrix(int[][] matrix) {    
        System.out.println("Array elements are: ");
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] createPascalTriangle(int n) {
        int[][] pascal = new int[n][];
        for(int i=0; i<n; i++) {
            //ith row have i+1 columns
            /*
             ans[0] = new int[1]
             ans[1] = new int[2]
             ans[2] = new int[3]
             ans[3] = new int[4]
             ans[4] = new int[5]
            */
            pascal[i] = new int[i+1];  // nembers of cols in ith row = i+1;
            pascal[i][0] = pascal[i][i] = 1;
            for(int j=1; j<i; j++) {
                pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
            }
        }
        return pascal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        int[][] createdPascalTriangle = createPascalTriangle(row);
        printMatrix(createdPascalTriangle);
        sc.close();
    }    
}
