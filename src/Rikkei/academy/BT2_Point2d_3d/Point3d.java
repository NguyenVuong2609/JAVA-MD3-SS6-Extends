package Rikkei.academy.BT2_Point2d_3d;

public class Point3d extends Point2d {
    private float z = 0.0f;
    private float[] XYZ = new float[3];

    public Point3d() {
    }

    public Point3d(float z) {
        this.z = z;
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
        this.XYZ[0] = getX();
        this.XYZ[1] = getY();
        this.XYZ[2] = z;
        return XYZ;
    }

    public void setXY(float x, float y ,float z) {
        XYZ[0] = x;
        XYZ[1] = y;
        XYZ[2] = z;
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "x=" + getX() +
                ", y=" + getY() +
                "z=" + z +
                '}';
    }
}
