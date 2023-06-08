import java.util.Scanner;
public class SpiralTraversalMatrix {

    static void printArray(int[][] matrix) {    
    System.out.println("Array elements are: ");
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] matrix, int r, int c) {
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
        int totalElements = 0;
        while(totalElements < r*c) {
            // top row -> leftCol to rightCol
            for(int j=leftCol; j<=rightCol && totalElements < r*c; j++) {
                System.out.print(matrix[topRow][j]+" ");
                totalElements++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for(int i=topRow; i<= bottomRow && totalElements < r*c; i++) {
                System.out.print(matrix[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;

            // bottomRow -> rightCol to left
            for(int j=rightCol; j>=leftCol && totalElements < r*c; j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for(int i=bottomRow; i>=topRow && totalElements < r*c; i--) {
                System.out.print(matrix[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Row and Column must be equal:");
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
        System.out.println("Input Matrix: ");
        printArray(matrix);

        System.out.println("Spiral traversal");
        printSpiralOrder(matrix, row, col);
        sc.close();
    }   
}