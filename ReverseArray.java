import java.util.Scanner;
public class ReverseArray {

    static void print_Array(int[] arr) {
        int n = arr.length;

        System.out.print("Arrays elements are: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void swapedArray(int[] arr) {
        int n = arr.length;
        int i=0;
        int j=n-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        print_Array(arr);
    }

    static void reverseArray(int[] arr) {
        int[] ans = new int[arr.length];
        int j = 0;
        for( int i = arr.length-1; i >= 0; i--) {
            ans[j] = arr[i];
            j++;
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
        sc.close();        
        reverseArray(arr);
        swapedArray(arr);
    }
}