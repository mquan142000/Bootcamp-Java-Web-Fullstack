public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Circle
        Circle circle = new Circle(2.5, "blue");
        System.out.println(circle);
        System.out.println("Circle area: " + circle.getArea());

        // Tạo đối tượng Cylinder với constructor mặc định
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
        System.out.println("Cylinder surface area: " + cylinder1.getSurfaceArea());
        System.out.println("Cylinder volume: " + cylinder1.getVolume());

        // Tạo đối tượng Cylinder với constructor có tham số
        Cylinder cylinder2 = new Cylinder(3.0, 5.0, "green");
        System.out.println(cylinder2);
        System.out.println("Cylinder surface area: " + cylinder2.getSurfaceArea());
        System.out.println("Cylinder volume: " + cylinder2.getVolume());

        // Thay đổi các thuộc tính của Cylinder
        cylinder2.setHeight(10.0);
        cylinder2.setRadius(4.0);
        cylinder2.setColor("yellow");
        System.out.println("Updated " + cylinder2);
        System.out.println("Updated cylinder surface area: " + cylinder2.getSurfaceArea());
        System.out.println("Updated cylinder volume: " + cylinder2.getVolume());
    }
}
