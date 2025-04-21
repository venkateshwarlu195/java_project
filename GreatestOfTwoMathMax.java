import java.util.Scanner;

public class GreatestOfTwoMathMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int greatest = Math.max(num1, num2);
         if(num1 == num2){
            System.out.println("Both numbers are equal");
        }
        else{
        System.out.println(greatest + " is the greater number.");
        }
        scanner.close();
    }
}