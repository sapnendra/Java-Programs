import java.util.Scanner;
import java.util.Arrays;

public class FirstRepeatValInArray { 
    static int repeatVal(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        int size = input.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++) {
            arr[i] = input.nextInt();
        }

        int ans = repeatVal(arr);
        System.out.println("First repeat value in entire array: "+ans);

	}
}

