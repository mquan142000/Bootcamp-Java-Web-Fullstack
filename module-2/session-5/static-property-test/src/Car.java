public class Car {
    private String name;
    private String color;
    public static int numberOfCar;

    public Car() {
    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
        numberOfCar++;
    }
}
