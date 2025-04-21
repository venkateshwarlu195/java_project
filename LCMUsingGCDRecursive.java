import java.util.Scanner;

public class LCMUsingGCDRecursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd = calculateGCDRecursive(num1, num2);
        long lcm = (long) num1 * num2 / gcd;  // Use long to prevent potential overflow.
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
        scanner.close();
    }

    // Recursive implementation of GCD using Euclidean Algorithm
    public static int calculateGCDRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCDRecursive(b, a % b);
    }
}

