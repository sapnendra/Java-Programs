import java.util.Scanner;
public class RotateMatrix {

    static void printMatrix(int[][] matrix) {    
        System.out.println("Array elements are: ");
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] transpose(int[][] matrix, int r, int c) {
        int[][] tran = new int[c][r];
        for(int i=0; i<c; i++) {
            for(int j=0; j<r; j++) {
                tran[i][j] = matrix[j][i];
            }
        }

        return tran;
    }

    static void transposeInPlace(int[][] matrix, int r, int c) {
        for(int i=0; i<c; i++) {
            for(int j=i; j<r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void reverseArray(int[] arr) {
        int i=0;
        int j= arr.length-1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    static void rotate(int[][] matrix, int r) {
        // step1: transpose
        transposeInPlace(matrix, r, r);

        // step2: reverse each row of transposed matrix
        for(int i=0; i<r; i++) {
            /* 
                1, 2, 3
                4, 5, 6
                7, 8, 9

                i=0
                reverseArray({1, 2, 3})
            */
            reverseArray(matrix[i]);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Rows and Column must be equal:");

        System.out.print("Enter the size of row: ");
        int row = sc.nextInt();
        System.out.print("Enter the size of col: ");
        int col = sc.nextInt();
        System.out.println("Enter "+row*col+" elements:");
        int[][] matrix = new int[row][col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
               matrix[i][j] = sc.nextInt(); 
            }
        }

        System.out.println("Original matrix:");
        printMatrix(matrix);

        System.out.println("Transpose matrix:");
        int[][] ans = transpose(matrix,row,col);
        printMatrix(ans);
        //transposeInPlace(matrix,row, col);

        rotate(matrix, row);

        System.out.println("Rotation of matrix:");
        printMatrix(matrix);
        sc.close();
    }
}
