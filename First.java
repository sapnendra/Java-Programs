import java.util.Scanner;
public class First{
    static int fact(int n) {
        // base case
        if(n == 0) {
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
        sc.close();
    }
}
