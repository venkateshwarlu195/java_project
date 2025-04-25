import java.util.Scanner;

public class CountDigitsLog10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            count = (int) Math.log10(Math.abs(number)) + 1; //handle negative numbers
        }
        System.out.println("Number of digits: " + count);
        scanner.close();
    }
}