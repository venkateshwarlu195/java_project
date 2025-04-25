import java.util.Scanner;

public class SumOfNaturalNumbersFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        long sum = 0;

        if (n <= 0) {
            System.out.println("Sum is 0.  Please enter a positive integer.");
        } else {
            sum = (long)n * (n + 1) / 2; // Use long to prevent potential overflow
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        }
        scanner.close();
    }
}
