public class Main {
    public static void main(String[] args) {
        Point2d point1 = new Point2d(3.5f, 0.5f);
        System.out.println("Point2d: " + point1);
        System.out.println("X: " + point1.getX());
        System.out.println("Y: " + point1.getY());

        point1.setXY(7.5f, 9.5f);
        System.out.println("Updated Point2d: " + point1);

        Point3d point2 = new Point3d(2.5f, 3.5f, 1.5f);
        System.out.println("Point3d: " + point2);
        System.out.println("X: " + point2.getX());
        System.out.println("Y: " + point2.getY());
        System.out.println("Z: " + point2.getZ());

        point2.setXYZ(4.5f, 5.5f, 6.5f);
        System.out.println("Update Point3d: " + point2);
    }
}