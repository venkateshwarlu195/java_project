import java.util.Scanner;

public class PalindromeNumberStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        String numStr = String.valueOf(number);
        String reversedStr = new StringBuilder(numStr).reverse().toString();

        if (numStr.equals(reversedStr)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        scanner.close();
    }
}
