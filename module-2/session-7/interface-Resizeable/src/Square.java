public class Square extends Rectangle {

    public Square(double side){
        super(side, side);
    }

    public double getSide(){
        return getWidth();
    }
    public void resize(double percent){
        double newSide = getSide() * (1 + percent / 100);
        super.resize(percent);
        super.width = newSide;
        super.height = newSide;
    }
}
