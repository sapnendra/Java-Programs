import java.util.Scanner;
public class SortZeroesAndOnes {

    static void print_Array(int[] arr) {
        System.out.print("Array elements are: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void sortZeroesAndOnes(int[] arr) {
        int n = arr.length;

        //number of zeroes
        int count = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] == 0) {
                count++;
            }
        }
        // 0 to count -1 = 0s, count to n-1= 1s
        for(int i=0; i<count; i++) {
            arr[i] = 0;
        }
        for(int i = count; i < n; i++) {
            arr[i] = 1;
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
        sortZeroesAndOnes(arr);

        sc.close();
    }
}