public class Rectangle {

    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return (width + height) * 2;
    }
    public String display() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
