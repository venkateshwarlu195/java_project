import java.util.Scanner;

public class CountDigitsRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = countDigits(number);
        System.out.println("Number of digits: " + count);
        scanner.close();
    }

    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        } else if (number < 0) {
            return countDigits(-number); // Handle negative numbers
        } else {
            return 1 + countDigits(number / 10);
        }
    }
}
