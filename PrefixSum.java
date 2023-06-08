import java.util.Scanner;
public class PrefixSum {

    static void print_Array(int[] arr) {
        int n = arr.length;
        System.out.print("Array elements are: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void prefixSum(int[] arr) {
        int n = arr.length;
        //int[] ans = new int[n];
        //ans[0] = arr[0];
        for(int i=1; i<n; i++) {
            //ans[i] = ans[i-1]+arr[i];
            arr[i] = arr[i-1]+arr[i];
        }

        print_Array(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:   ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter "+size+" elements: ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array: ");
        print_Array(arr);
        sc.close();

        System.out.println("Prefix sum array: ");
        prefixSum(arr);
    }
}