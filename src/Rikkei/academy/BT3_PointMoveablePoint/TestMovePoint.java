package Rikkei.academy.BT3_PointMoveablePoint;

public class TestMovePoint {
    public static void main(String[] args) {
        MoveablePoint test = new MoveablePoint(5,5,2,2);
        System.out.println(test);
        System.out.println(test.move());
    }
}
