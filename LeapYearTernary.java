import java.util.Scanner;

public class LeapYearTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        String result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
                ? year + " is a leap year."
                : year + " is not a leap year.";
        System.out.println(result);
        scanner.close();
    }
}
