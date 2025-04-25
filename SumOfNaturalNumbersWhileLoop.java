
import java.util.Scanner;

public class SumOfNaturalNumbersWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        long sum = 0;
        int i = 1;

         if (n <= 0) {
            System.out.println("Sum is 0.  Please enter a positive integer.");
        } else {
            while (i <= n) {
                sum += i;
                i++;
            }
             System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        }
        scanner.close();
    }
}
