public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }
    void setColor(String color){
        this.color = color;
    }
    public boolean getFill(){
        return filled;
    }
    void setFill(boolean filled){
        this.filled = filled;
    }

    public String toString(){
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
