import java.util.Scanner;

public class LCMDirectCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        long lcm = calculateLCMDirect(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
        scanner.close();
    }

    // Direct calculation of LCM (less efficient)
    public static long calculateLCMDirect(int a, int b) {
        long max = Math.max(a, b);
        long lcm = max;

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm += max;
        }
        return lcm;
    }
}