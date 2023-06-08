import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original_n = n;

        int sum = 0;
        while(n > 0) {
            int rem = n%10;
            sum += rem;
            n = n/10;
        }

        System.out.println("Sum of digits of " + original_n + ": " + sum);
    }
}
