import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        long factorial = calculateFactorial(number);

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
        scanner.close();
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return -1; // Indicate an error condition
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
