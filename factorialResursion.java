import java.util.Scanner;
public class factorialResursion {

    static int fact(int n) {

        // base case
        if(n == 0) {
            return 1;
        }
        
        // samller problem - recursive work
        int subProb = fact(n-1);

        // main problem - self work
        return n*subProb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Factorial of "+n+": ");
        int ans = fact(n);
        System.out.println(ans);
        sc.close();
    }
}
