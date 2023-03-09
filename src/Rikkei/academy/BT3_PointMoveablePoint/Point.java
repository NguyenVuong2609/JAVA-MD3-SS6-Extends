package Rikkei.academy.BT3_PointMoveablePoint;

public class Point {
    private float x = 0.0f, y = 0.0f;
    private float[] XY = {x,y};

    public Point() {
    }

    public Point(float x, float y) {
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
