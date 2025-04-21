import java.util.Scanner;

public class CircleAreaMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = calculateCircleArea(radius);
        System.out.println("The area of the circle is: " + area);
        scanner.close();
    }

    public static double calculateCircleArea(double radius) {
        final double PI = Math.PI;
        return PI * radius * radius;
    }
}
