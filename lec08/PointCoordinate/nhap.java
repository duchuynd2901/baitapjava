package lec08.PointCoordinate;

import java.util.Scanner;

public class nhap {
    private double x;
    private double y;

   
    public nhap(double x, double y) {
        this.x = x;
        this.y = y;
    }

   
    public nhap() {
    }

    public double getx() {
        return x;
    }

    public double gety() {
        return y;
    }


    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }


    void display() {
        System.out.println("Toa do diem: (" + x + ", " + y + ")");
        System.out.println("Khoang cach den goc O: " + distanceFromOrigin());
    }


    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap x: ");
        x = sc.nextDouble();

        System.out.print("Nhap y: ");
        y = sc.nextDouble();
    }
}