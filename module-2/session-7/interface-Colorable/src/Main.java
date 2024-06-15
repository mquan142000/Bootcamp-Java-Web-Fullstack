public class Main {
    public static void main(String[] args) {
        Object[] shapes = new Object[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 3);
        shapes[2] = new Square(5);

        for (Object shape : shapes) {
            double area = 0;
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                area = circle.getArea();
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                area = rectangle.getArea();
            }
            System.out.println("Area: " + area);

            if (shape instanceof Colorable) {
                Colorable colorable = (Colorable) shape;
                colorable.howToColor();
            }
        }
    }
}