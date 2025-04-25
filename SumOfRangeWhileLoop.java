import java.util.Scanner;

public class SumOfRangeWhileLoop {
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
            int i = start;
            while (i <= end) {
                sum += i;
                i++;
            }
            System.out.println("Sum of numbers from " + start + " to " + end + " is: " + sum);
        }
        scanner.close();
    }
}
