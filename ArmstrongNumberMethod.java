import java.util.Scanner;

public class ArmstrongNumberMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int num = Math.abs(number); //handle negative numbers

        int n = 0;
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            n++;
        }

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }
        return (originalNumber == sum);
    }
}
