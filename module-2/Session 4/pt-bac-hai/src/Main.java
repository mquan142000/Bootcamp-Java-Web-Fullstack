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
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt: " + r1 + "và" + r2 + "");
        } else if (delta == 0) {
            double r = (-b) / 2 * a;
            System.out.println("Phương trình có 1 nghiệm: " + r + "");
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}