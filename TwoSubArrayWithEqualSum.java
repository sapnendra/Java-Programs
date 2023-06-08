import java.util.Scanner;
public class TwoSubArrayWithEqualSum {

    static int calTotalSum(int[] arr) {
        int totalSum = 0;
        for(int i=0; i< arr.length; i++) {
            totalSum+= arr[i];
        }
        return totalSum;
    }

    static boolean checkSubArrayEqual(int[] arr) {
        int n = arr.length;
        int totalSum = calTotalSum(arr);
        int prefSum = 0;
        for(int i=0; i<n; i++) {
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if(suffixSum == prefSum) {
                return true;
            }
        } 
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter "+size+ " elements: ");
        for(int i =0; i< size; i++) {
            arr[i]  = sc.nextInt();
        }

        if(checkSubArrayEqual(arr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
