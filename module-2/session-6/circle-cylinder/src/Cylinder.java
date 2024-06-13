public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this.height = 2.0;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * radius * height + 2 * super.getArea();
    }

    public double getVolume() {
        return super.getArea() * height;
    }
    public String toString() {
        return "Cylinder{" +
                "height=" + this.height +
                ", which is a subclass of "
                + super.toString() +
                '}';
    }
}
