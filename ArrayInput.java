import java.util.Scanner;
import java.util.Arrays; 

public class ArrayInput {

    static void print_Array(int[] arr) { 
        System.out.print("Array element: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size in integer: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        // taking input element from user
        System.out.print("Enter " + size + " Array element one by one: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        print_Array(arr);

        // cloning an array
        int[] arr2 = arr.clone();
        arr2[0] = 12;
        arr2[1] = 13;
        arr2[2] = 14;
        arr2[3] = 15;
        print_Array(arr2);

        int[] arr3 = Arrays.copyOf(arr, arr.length-2);
        arr3[0] = 100;
        print_Array(arr3);

        int[] arr4 = Arrays.copyOfRange(arr,1,4);
        print_Array(arr4);
    }
}
