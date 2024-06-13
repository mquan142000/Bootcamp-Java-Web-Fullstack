public class Main {
    public static void main(String[] args) {
        Point point = new Point(2.0f, 3.0f);
        System.out.println("Point: " + point);

        MovablePoint movablePoint = new MovablePoint(2.0f, 3.0f, 1.0f, 2.0f);
        System.out.println("MovablePoint: " + movablePoint);
        movablePoint.move();
        System.out.println("Moved MovablePoint: " + movablePoint);
    }
}