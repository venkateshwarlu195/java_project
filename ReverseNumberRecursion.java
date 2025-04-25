
import java.util.Scanner;

public class ReverseNumberRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
        scanner.close();
    }

    public static int reverseNumber(int number) {
        if (number == 0) {
            return 0;
        }
        if (number < 0)
        {
            return -reverseNumber(-number);
        }
        else {
            int lastDigit = number % 10;
            int remainingDigits = number / 10;
            int reversedRemaining = reverseNumber(remainingDigits);

            // Find the number of digits in remainingDigits
            int digitsInRemaining = 0;
            int temp = remainingDigits;
            while (temp > 0) {
                temp /= 10;
                digitsInRemaining++;
            }

            return lastDigit * (int) Math.pow(10, digitsInRemaining) + reversedRemaining;
        }
    }
}
