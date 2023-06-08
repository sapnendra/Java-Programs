import java.util.Scanner;
import java.util.Arrays;

public class FindUnique {

    static int findUnique(int[] arr) {
        int size = arr.length;
        for(int i=0; i<size; i++) {
            for(int j=i+1; j<size; j++) {
                if(arr[i] == arr[j] ) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = 0;
        for(int i=0; i<size; i++) {
            if(arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter "+size+ " element one by one:");

        for(int i=0; i<size; i++) {
            arr[i] = input.nextInt();
        }

        int unique = findUnique(arr);
        System.out.println("Unique element in the entire array: " + unique);
	}
}

