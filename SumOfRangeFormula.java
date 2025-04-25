import java.util.Scanner;

public class SumOfRangeFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();
        long sum = 0;

        if (start > end) {
            System.out.println("Invalid range: start should be less than or equal to end.");
        } else {
            // Sum of numbers from 1 to end - Sum of numbers from 1 to start-1
            sum = (long)end * (end + 1) / 2 - (long)(start - 1) * start / 2;
            System.out.println("Sum of numbers from " + start + " to " + end + " is: " + sum);
        }
        scanner.close();
    }
}
