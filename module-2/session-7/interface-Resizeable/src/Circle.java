
public class Circle implements Resizeable {
    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    public void resize(double percent){
        this.radius += this.radius * percent /100;
    }
}


