import java.util.Scanner;
import java.util.Arrays;

public class SecLargestEle {

    static int maxEle(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > mx) {
                mx = arr[i];
            }
        }

        return mx;
    }

    static int secMax(int [] arr) {
        int secMx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > secMx) {
                secMx = arr[i];
            }
        }

        return secMx;
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter "+size+" element one by one: ");
        for(int i=0; i<size; i++) {
            arr[i] = input.nextInt();
        }

        int max = maxEle(arr);
        for(int i=0; i<size; i++) {
            if(arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        
        int secLargest = secMax(arr);
        System.out.println("Second largest from entire array: "+ secLargest);
	}
}

