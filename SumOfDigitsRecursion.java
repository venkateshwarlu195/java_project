import java.util.Scanner;

public class SumOfDigitsRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }

    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        } else if (number < 0) {
            return sumOfDigits(-number); // Handle negative numbers
        } else {
            return (number % 10) + sumOfDigits(number / 10);
        }
    }
}
