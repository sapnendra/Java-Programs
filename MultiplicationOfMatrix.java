import java.util.Scanner;
public class MultiplicationOfMatrix {
    
    static void printArray(int[][] arr) {    
        System.out.println("Array elements are: ");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void multiplicationMatrix(int[][] arr, int row1, int col1, int[][] arr2, int row2,int col2) {
        if(col1 != row2) {
            System.out.println("Wrong input:Multiplication is not possible, Thank you");
            return;
        }
        else {
            int[][] ans = new int[row1][col2];
            for(int i=0;i<row1;i++) {
                for(int j=0;j<col2;j++) {
                    for(int k=0; k<col1; k++) {
                        ans[i][j] += (arr[i][k]*arr2[k][j]);
                    }
                }
            }

            printArray(ans);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Column of first matrix and row of second matrix must be equal");

        System.out.print("Enter the size of row firt array: ");
        int row = sc.nextInt();
        System.out.print("Enter the size of col first array: ");
        int col = sc.nextInt();
        System.out.println("Enter "+row*col+" elements:");
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
               arr[i][j] = sc.nextInt(); 
            }
        }

        System.out.print("Enter the size of row second array: ");
        int row2 = sc.nextInt();
        System.out.print("Enter the size of col second array: ");
        int col2 = sc.nextInt();
        System.out.println("Enter "+row2*col2+" elements:");
        int[][] arr2 = new int[row2][col2];
        for(int i=0;i<row2;i++) {
            for(int j=0;j<col2;j++) {
               arr2[i][j] = sc.nextInt(); 
            }
        }

        System.out.println("matrix#1:");
        printArray(arr);

        System.out.println("Matrix#2:");
        printArray(arr2);

        System.out.println("Multiplication of matrix#1 and matrix#2:");
        multiplicationMatrix(arr, row, col, arr2, row2, col2);
        sc.close();
    }   
}
