/*

   // Star based Pyramid

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        for(int i = 1;i <= row; i++) {  // traversing over rows
            
            // printing row-i spaces
            for(int k=1; k<=row-i; k++) {
                System.out.print(" ");
            }
            // printing 2*i-1 stars
            for(int j=1; j<=(2*i-1); j++) {
                System.out.print("*");
            }
           // for(int a=1; a<i; a++) {
          //      System.out.print("*");    // Other mathd to do above thing
         //   }

            System.out.println();
        }
    }
}

*/

// Numerical Pyramid

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        for(int i = 1;i <= row; i++) {  // traversing over rows
            
            // printing row-i spaces
            for(int k=1; k<=row-i; k++) {
                System.out.print(" ");
            }
            // printing i numbers
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            
            for(int a=i-1; a>=1; a--) {
                System.out.print(a);
            }

            System.out.println();
        }
    }
}

