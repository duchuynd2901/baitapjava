/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec08.rectangle;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Rectangular {

    private double length;
    private double width;

    public Rectangular() {
    }

    public Rectangular(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        length = scan.nextDouble();
        System.out.println("nhap chieu rong");
        width = scan.nextDouble();
    }

    public void display() {
        System.out.println("Dien tich: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
    }
}
