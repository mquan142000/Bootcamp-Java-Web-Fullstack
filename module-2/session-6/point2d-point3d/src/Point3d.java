
public class Point3d extends Point2d {
    private float z;

    public Point3d() {
        this.z = 0.0f;
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }


    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{x, y, z};
    }
    void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String toString() {
        return "Point3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
