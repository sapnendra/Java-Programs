import java.util.Scanner;
import java.util.Arrays;

public class CombineMinMaxEleInArray {
	
	 static void print_Array(int[] arr) {
	 	System.out.print("Array element: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	 }

    static void minMaxEle(int[] arr) {    
        /* Or we can use Sort Method and
           pick first element and last element
           fill it in the array
        */
        int min = 1000000;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        //System.out.println(min);

        int max = -1000000;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        //System.out.println(max);

        int[] arr2 = new int[2];
        arr2[0] = min;
        arr2[1] = max;

        print_Array(arr2);
    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size of Array: ");
		int size = input.nextInt();
		int[] arr = new int[size];

		System.out.print("Enter "+size+" element one by one: ");
		for(int i=0; i<size; i++) {
			arr[i] = input.nextInt();
		}

		minMaxEle(arr);
	}
}

