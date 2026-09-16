/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec10.PrintableInterface;

/**
 *
 * @author ADMIN
 */
public class Report implements Printable {

    private String title;

    public Report(String t) {
        this.title = t;
    }

    @Override
    public void print() {
        System.out.println("Report: " + title);
    }
}
