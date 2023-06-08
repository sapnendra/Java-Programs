import java.util.Scanner;
public class queriesByFreqArray {

    static int[] makeFrequencyArray(int[] arr) {
        int[] freq = new int[100005];
        for(int i=0; i<arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    static void presentArray() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter "+size+" elements: ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] freq = makeFrequencyArray(arr);

        System.out.print("Enter number of queries:");
        int q = sc.nextInt();

        while(q > 0) {
            System.out.print("Enter number to be searched: ");
            int x = sc.nextInt();
            if(freq[x] > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            q--;
        }
        sc.close();
    }
}
