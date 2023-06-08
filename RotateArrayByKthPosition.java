import java.util.Scanner;
public class RotateArrayByKthPosition {

    static void print_Array(int[] array) {
        System.out.print("Arrays element are: ");
        for(int var:array) {
            System.out.print(var+" ");
        }
        System.out.println();
    }

    static void rotateArraybyK(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        int[] ans = new int[n];
        int a = 0;
        for(int i=n-k; i<n; i++) {
            ans[a++] = arr[i];
        }
        for(int j=0; j<n-k; j++) {
            ans[a++] = arr[j];
        }
        
        print_Array(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array before rotation-");
        print_Array(arr);

        System.out.print("Enter Rotate position: ");
        int k = sc.nextInt();
        System.out.println("Original array after rotation by: "+k);
        rotateArraybyK(arr, k);
        sc.close();
    }
}