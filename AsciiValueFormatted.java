import java.util.Scanner;

public class AsciiValueFormatted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        System.out.printf("The ASCII value of %c is %d%n", ch, (int)ch);
        scanner.close();
    }
}
