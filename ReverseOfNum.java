import java.util.Scanner;

public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original_n = n;

        int reverse = 0;
        while(n > 0) {
            int rem = n%10;
            reverse = (reverse*10 + rem);
            n = n/10;
        }

        System.out.println("Reverse of " + original_n + ": " + reverse);
    }
}
