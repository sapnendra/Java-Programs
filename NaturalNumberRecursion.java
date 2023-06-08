import java.util.Scanner;
public class NaturalNumberRecursion {

    static void print1toN(int n) { // 1, 2, 3,....., n-1, n
        
        // base-case
        if(n == 1) {  
            System.out.println(1);
            return;
        }

        // self work
        System.out.println(n); // decreasing order  output: 5, 4, 3, 2, 1
        
        // recursive work
        print1toN(n-1);  // 1, 2, ... , n-1
        // System.out.println(n); // increasing order   output: 1, 2, 3, 4, 5
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        print1toN(n);
        sc.close();
    }
}