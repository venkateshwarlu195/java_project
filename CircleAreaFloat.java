import java.util.Scanner;

public class CircleAreaFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        float area = calculateCircleAreaFloat(radius);
        System.out.println("The area of the circle is: " + area);
        scanner.close();
    }

     public static float calculateCircleAreaFloat(double radius) {
        final float PI = (float) Math.PI;
        return PI * (float)radius * (float)radius;
    }
}