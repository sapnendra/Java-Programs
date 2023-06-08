import java.util.Scanner;
public class SortZeroesAndOnesOptimized {

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

    static void sortZeroesAndOnesOptimized(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left < right) {
            if(arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] == 0) {
                left++;
            }
            if(arr[right] == 1) {
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

        System.out.println("Array sorted: ");
        sortZeroesAndOnesOptimized(arr);

        sc.close();
    }
}
