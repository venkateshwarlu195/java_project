
import java.util.Scanner;

public class SumOfDigitsForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int sum = 0;

        String numStr = String.valueOf(Math.abs(number)); // Handle negative numbers
        for (int i = 0; i < numStr.length(); i++) {
            sum += Character.getNumericValue(numStr.charAt(i));
        }
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}
