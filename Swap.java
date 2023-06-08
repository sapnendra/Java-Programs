import java.util.Scanner;
public class Swap {
    static void swap(int a, int b) {
        System.out.println("Original value before swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        // int temp = a;
        // a = b;
        // b = temp;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Original value after swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        swap(a,b);
        input.close();
    }
}
