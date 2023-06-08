import java.util.Scanner;
public class RotateArrayByKthPositionINPLACE {

    static void print_Array(int[] array) {
        System.out.print("Arrays element are: ");
        for(int var:array) {
            System.out.print(var+" ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i, int j) {
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateArrayInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);

        print_Array(arr); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before rotation-");
        print_Array(arr);

        System.out.print("Enter Rotate position: ");
        int k = sc.nextInt();
        System.out.println("Array after rotation by: "+k);
        rotateArrayInPlace(arr, k);

        sc.close();
    }
}
