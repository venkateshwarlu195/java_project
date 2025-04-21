import java.util.Scanner;

public class GCDRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd = calculateGCDRecursive(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        scanner.close();
    }

    public static int calculateGCDRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCDRecursive(b, a % b);
    }
}