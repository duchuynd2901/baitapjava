/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec09.Super.InstanceVarible;

/**
 *
 * @author ADMIN
 */
public class Husky extends Dog {
        int price = 1500;
        void displayPrice(){
            System.out.println("Dog's price:" + super.price);
            System.out.println("Husky's price:" + price);
        }
}
