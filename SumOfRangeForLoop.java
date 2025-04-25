import java.util.Scanner;

public class SumOfRangeForLoop {
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
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from " + start + " to " + end + " is: " + sum);
        }
        scanner.close();
    }
}
