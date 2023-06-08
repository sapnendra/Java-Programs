import java.util.Scanner;
public class SqureSortingIncludeAbs {
    static void print_Array(int[] arr) {
        int n = arr.length;
        System.out.print("Array elements are: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr) {
        int i=0, j = arr.length-1;
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void sortSqures(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int[] ans = new int[n];
        int k = n-1;
        while(left <= right) {
            if(Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left]*arr[left];
                left++;
            } else {
                ans[k--] = arr[right]*arr[right];
                right--;
            }
        }
        //reverse(ans);   Fun fact
        print_Array(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter "+size+" element: ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        print_Array(arr);

        System.out.println("Sorted squre Array: ");
        sortSqures(arr);

        sc.close();
    }
}
