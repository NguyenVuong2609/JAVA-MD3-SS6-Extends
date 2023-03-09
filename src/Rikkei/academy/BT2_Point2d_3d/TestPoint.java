package Rikkei.academy.BT2_Point2d_3d;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point3d test = new Point3d(1,2,3);
        System.out.println(Arrays.toString(test.getXYZ()));
        System.out.println(test);
    }
}
