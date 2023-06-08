import java.util.Scanner;
public class RectangularPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt(), c = sc.nextInt();
        for(int i=1;i<=r;i++) {
            for(int j=1;j<=c;j++) {
                if( i==1 || i==r || j==1 || j==c)
                    System.out.print(j);
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
