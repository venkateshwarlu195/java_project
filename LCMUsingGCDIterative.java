import java.util.Scanner;

public class LCMUsingGCDIterative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd = calculateGCDIterative(num1, num2);
        long lcm = (long) num1 * num2 / gcd; // Use long to prevent potential overflow
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
        scanner.close();
    }

    // Iterative implementation of GCD using Euclidean Algorithm
    public static int calculateGCDIterative(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
