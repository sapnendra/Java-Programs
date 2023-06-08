import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int sum = 0;
        for(int i = 1; i<= n;i++) {
            if(i%2 == 0) 
                sum -= i;
            else
                sum += i;
        }

        System.out.println("Sum in a series: "+ sum);
    }
}
