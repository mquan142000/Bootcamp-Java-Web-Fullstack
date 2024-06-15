import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = scanner.nextDouble();

        System.out.println("Enter b: ");
        double b = scanner.nextDouble();

        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        System.out.println("Enter color: ");
        String color = scanner.next();

        Triangle triangle = new Triangle(a, b, c);
        triangle.setColor(color);

        System.out.println("Tam giác có màu: " + triangle.getColor());
        System.out.println("Diện tích của tam giác: " + triangle.getArea());
        System.out.println("Chu vi của tam giác: " + triangle.getPerimeter());
        System.out.println(triangle.toString());
        scanner.close();
    }
}