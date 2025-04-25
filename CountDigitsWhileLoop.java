import java.util.Scanner;

public class CountDigitsWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            int num = Math.abs(number); //handle negative numbers
            while (num > 0) {
                num /= 10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
        scanner.close();
    }
}
