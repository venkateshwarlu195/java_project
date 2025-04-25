import java.util.Scanner;

public class ArmstrongNumberForLoop {
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

        int n = countDigits(num);

        for (; num > 0; num /= 10) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
        }
        return (originalNumber == sum);
    }

    public static int countDigits(int number) {
        int count = 0;
        int num = Math.abs(number);
        if (num == 0) {
            return 1;
        }
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
```