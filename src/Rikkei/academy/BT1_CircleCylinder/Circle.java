package Rikkei.academy.BT1_CircleCylinder;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(2, radius) * 3.14;
    }

    public double getPerimeter() {
        return radius * 2 * 3.14;
    }

    @Override
    public String toString() {
        return "A Circle with radius= " + radius;
    }
}
