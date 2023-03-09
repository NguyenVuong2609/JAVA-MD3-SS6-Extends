package Rikkei.academy.BT3_PointMoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f, ySpeed = 0.0f;
    private float[] xySpeed = {xSpeed, ySpeed};

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return xySpeed;
    }

    public void setSpeed(float[] xySpeed) {
        this.xySpeed[0] = xSpeed;
        this.xySpeed[1] = ySpeed;
    }

    public MoveablePoint move(){
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
