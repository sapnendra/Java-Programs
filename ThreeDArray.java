import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        // initialize a 3D array of size (3, 3, 3)
        int[][][] array3d = new int[3][3][3];

        // take input for the array
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("Enter the value for array3d[" + i + "][" + j + "][" + k + "]: ");
                    array3d[i][j][k] = scanner.nextInt();
                }
            }
        }

        // print the array
        System.out.println("The 3D array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(array3d[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
		scanner.close();
    }
}
