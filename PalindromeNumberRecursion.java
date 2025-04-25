import java.util.Scanner;

public class PalindromeNumberRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = -number; // Handle negative numbers
        }
        int originalNumber = number;
        int reversedNumber = reverseNumber(number);
        return originalNumber == reversedNumber;
    }

    public static int reverseNumber(int number) {
        if (number == 0) {
            return 0;
        } else {
            int lastDigit = number % 10;
            int remainingDigits = number / 10;
            int reversedRemaining = reverseNumber(remainingDigits);
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
