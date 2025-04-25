import java.util.Scanner;

public class ReverseNumberStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        String numStr = String.valueOf(number);
        StringBuilder sb = new StringBuilder(numStr);
        String reversedStr = sb.reverse().toString();
        int reversedNumber = 0;
        try{
             reversedNumber = Integer.parseInt(reversedStr);
        }
        catch(NumberFormatException e){
            System.out.println("Number too large to reverse using this method.  Try a different method.");
            return;

        }

        System.out.println("Reversed number: " + reversedNumber);
        scanner.close();
    }
}
