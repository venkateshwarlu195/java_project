import java.util.Scanner;

public class CircleAreaDirect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = Math.PI;

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
        scanner.close();
    }
}
