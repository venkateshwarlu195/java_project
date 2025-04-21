import java.util.Scanner;

public class CircleAreaFormatted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        System.out.printf("The area of the circle is: %.2f%n", calculateCircleArea(radius));
        scanner.close();
    }

    public static double calculateCircleArea(double radius) {
        final double PI = Math.PI;
        return PI * radius * radius;
    }
}