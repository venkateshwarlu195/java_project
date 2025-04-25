import java.util.Scanner;

public class ReverseNumberWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;
        int num = Math.abs(number); //handle negative numbers

        while (num > 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }
        if(number < 0){
            reversedNumber = -reversedNumber;
        }

        System.out.println("Reversed number: " + reversedNumber);
        scanner.close();
    }
}
