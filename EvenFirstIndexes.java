import java.util.Scanner;
public class EvenFirstIndexes {

    static void print_Array(int[] arr) {
        System.out.print("Array elements are: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void firstEvenIndex(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left < right) {
            if(arr[left]%2 != 0 && arr[right]%2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]%2 == 0) {
                left++;
            }
            if(arr[right]%2 != 0) {
                right--;
            }
        }

        print_Array(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter "+size+" element: ");
        for(int i =0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        print_Array(arr);

        System.out.println("Even number first in Array: ");
        firstEvenIndex(arr);

        sc.close();
    }
}