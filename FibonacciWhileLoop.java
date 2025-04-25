import java.util.Scanner;

public class FibonacciWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci series up to " + n + ":");
            int first = 0, second = 1;
            int i = 1;
            while (i <= n) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
                i++;
            }
            System.out.println();
        }
        scanner.close();
    }
}
