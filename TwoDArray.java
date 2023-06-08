import java.util.Scanner;
public class TwoDArray {

    static void printArray(int[][] arr,int row, int col) {    
    System.out.println("Array elements are: ");
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
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

        printArray(arr,row,col);
        sc.close();
    }   
}