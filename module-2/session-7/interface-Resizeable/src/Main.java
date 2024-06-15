
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 3);
        shapes[2] = new Square(5);

        Random rand = new Random();

        for (Resizeable shape : shapes) {
            double areaBefore = 0;
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                areaBefore = circle.getArea();
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                areaBefore = rectangle.getArea();
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                areaBefore = square.getArea();
            }

            System.out.println("Area before: " + areaBefore);

            double percent = 1 + rand.nextInt() * 100;
            shape.resize(percent);

            double areaAfter = 0;
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                areaAfter = circle.getArea();
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                areaAfter = rectangle.getArea();
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                areaAfter = square.getArea();
            }
            System.out.println("Area after: " + areaAfter);
        }
    }
}

