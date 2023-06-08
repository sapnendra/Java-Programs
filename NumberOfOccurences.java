import java.util.Scanner;
import java.util.Arrays;

public class NumberOfOccurences {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter size of Array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int count = 0;
        System.out.print("Enter " + size + " element one by one: ");
        for(int i=0; i<size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter which element(key) value you want to search: ");
        int key = input.nextInt();
        for(int i=0; i<size; i++) {
            if(arr[i] == key)
                count++;
        }

        System.out.println("Number of occurences for " + key +": " + count);
	}
}

