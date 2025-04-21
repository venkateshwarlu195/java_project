import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println("The number " + number + " is " + result + ".");
    }
}