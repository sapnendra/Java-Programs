import java.util.Scanner;

public class Pattern121Type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt(), c = sc.nextInt();
        for(int i=1; i<=r; i++) {
            for(int j=1; j<=c; j++) {
                if( (i+j)%2 == 0 )      // if even print 1
                    System.out.print(1);
                else                    // if odd print 2
                    System.out.print(2);
            }
            System.out.println();
        }
    }
}
