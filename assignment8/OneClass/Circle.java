/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec10.OneClass;

/**
 *
 * @author ADMIN
 */
public class Circle implements Drawable, Colorable {

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    public void fillColor() {
        System.out.println("Filling color for circle");
    }
}
