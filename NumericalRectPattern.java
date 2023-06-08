import java.util.Scanner;

public class NumericalRectPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        for(int i=1; i<=row; i++) { // traversing unto the rows
            // printing i to row
            for(int j=i; j<=row; j++)
                System.out.print(j+" ");
            // printing 1 to i-1
            for(int k=1; k<i; k++)
                System.out.print(k+" ");
            
            System.out.println();
        }
    }
}
