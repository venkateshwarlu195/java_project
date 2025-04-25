import java.util.Scanner;

public class SumOfDigitsWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int sum = 0;

        int num = Math.abs(number); // Handle negative numbers
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}
