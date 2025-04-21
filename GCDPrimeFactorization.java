import java.util.Scanner;

public class GCDPrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd = calculateGCDPrimeFactorization(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        scanner.close();
    }

    public static int calculateGCDPrimeFactorization(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        int gcd = 1;
        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}