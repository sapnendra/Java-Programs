
import java.util.Scanner;

public class HoloNumericPyramig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        for(int i = 1;i <= row; i++) {  // traversing over rows
            
            // printing row-i spaces
            for(int k=1; k<=row-i; k++) {
                System.out.print(" ");
            }

            for(int l=1;l<=2*i-1;l++) {
                if(l==1 || l==2*i-1 || i==row) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }

        /*
            for(int j=i; j<=i; j++) {
                System.out.print(j);
            }

            for(int a=i; a<=i-1; a++) {
                System.out.print(a);
            }
        */
            System.out.println();
        }
    }
}
