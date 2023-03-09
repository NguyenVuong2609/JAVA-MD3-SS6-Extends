package Rikkei.academy.BT2_Point2d_3d;

public class Point2d {
    private float x = 0.0f, y = 0.0f;
    private float[] XY = {x,y};

    public Point2d() {
    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return XY;
    }

    public void setXY(float x, float y) {
        this.XY[0] = x;
        this.XY[1] = y;
    }

    @Override
    public String toString() {
        return "Point2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
