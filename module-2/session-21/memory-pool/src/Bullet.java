public class Bullet {
    private int position;
    private static int count = 0;

    public Bullet(){
        count++;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void move() {
        position++;
    }
}
