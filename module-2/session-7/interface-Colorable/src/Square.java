public class Square extends Rectangle {

    public Square(double side){
        super(side, side);
    }

    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }
    public void howToColor(){
        System.out.println("Color all four sides.");
    }
}
