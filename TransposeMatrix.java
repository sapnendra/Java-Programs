import java.util.Scanner;
public class TransposeMatrix {

    static void printArray(int[][] matrix) {    
        System.out.println("Array elements are: ");
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] transpose(int[][] arr, int r, int c) {
        int[][] tran = new int[c][r];
        for(int i=0; i<c; i++) {
            for(int j=0; j<r; j++) {
                tran[i][j] = arr[j][i];
            }
        }

        return tran;
    }

    // static void swap(int[][] matrix, int i, int j) {
    //     int temp = matrix[i][j];
    //     matrix[i][j] = matrix[j][i];
    //     matrix[j][i] = temp;
    // }

    static void transposeInPlace(int[][] matrix, int r, int c) {
        //int[][] tran = new int[c][r];
        for(int i=0; i<c; i++) {
            for(int j=i; j<r; j++) {
                //swap(matrix, matrix[i][j], matrix[j][i]);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Column of first matrix and row of second matrix must be equal");

        System.out.print("Enter the size of row: ");
        int row = sc.nextInt();
        System.out.print("Enter the size of col: ");
        int col = sc.nextInt();
        System.out.println("Enter "+row*col+" elements:");
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
               arr[i][j] = sc.nextInt(); 
            }
        }

        System.out.println("Original matrix:");
        printArray(arr);

        System.out.println("Transpose matrix:");
        //int[][] ans = transpose(arr,row,col);
        //printArray(ans);
        transposeInPlace(arr, row, col);
        printArray(arr);
        sc.close();
    }
}
