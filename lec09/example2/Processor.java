/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec09.example2;

/**
 *
 * @author ADMIN
 */
public class Processor {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("ID: " + dog.dogID);
        System.out.println("Source: " +
        dog.source);
        dog.makeSound();
        dog.guardHouse();
    }
}
