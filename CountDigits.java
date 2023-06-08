import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long original_n = n;

        int count = 0;
        while(n > 0) {
            // int rem = n%10;

            count++;
            n = n/10;
        }
        System.out.println("Number of digits of " + original_n +": " + count);

    }
}
