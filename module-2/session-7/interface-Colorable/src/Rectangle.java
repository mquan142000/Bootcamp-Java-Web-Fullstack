
public class Rectangle implements Colorable {
    protected double width;
    protected double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public void resize(double percent) {
        this.width *= this.width * percent / 100;
        this.height *= this.height * percent / 100;
    }
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
