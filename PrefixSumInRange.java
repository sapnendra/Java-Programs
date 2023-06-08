import java.util.Scanner;
public class PrefixSumInRange {
    static void print_Array(int[] arr) {
        int n = arr.length;
        System.out.print("Array elements are: ");
        for(int i=1; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    

    static int[] prefixSum(int[] pref) {
        int n = pref.length;
        //int[] ans = new int[n];
        //ans[0] = arr[0];
        for(int i=1; i<n; i++) {
            //ans[i] = ans[i-1]+arr[i];
            pref[i] += pref[i-1];
        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size+1];
        System.out.print("Enter "+size+" elements: ");
        for(int i=1; i<=size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        print_Array(arr);

        System.out.println("Prefix sum array: ");
        int[] prefSum = prefixSum(arr);
        print_Array(prefSum);

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        while(q-- > 0) {
            System.out.print("Enter range: ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int sum = prefSum[r] - prefSum[l-1];
            System.out.println("Prefix sum b/w "+l+" & "+r+": "+sum);
        }
        sc.close();
    }
}
