package Rikkei.academy.BT4_Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = 0, side2 = 0, side3 = 0;
        System.out.println("------------------Triangle-----------------------");
        while (true) {
            System.out.println("Nhập cạnh số 1:");
            side1 = sc.nextDouble();
            System.out.println("Nhập cạnh số 2:");
            side2 = sc.nextDouble();
            System.out.println("Nhập cạnh số 3:");
            side3 = sc.nextDouble();
            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
                System.out.println("Nhập 3 cạnh thành công.");
                break;
            }
            else
                System.out.println("Tam giác không phù hợp.");
        }
        Triangle test = new Triangle(side1,side2,side3);
        System.out.println(test.toString());
        System.out.println("Diện tích: " + test.getArea());
        System.out.println("Chu vi: " + test.getPerimeter());
    }
}
