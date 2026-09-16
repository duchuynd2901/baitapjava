/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec10.SharedField;

/**
 *
 * @author ADMIN
 */
public abstract class Account {

    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public abstract String getAccountType();

    public void display() {
        System.out.println("Account Type: " + getAccountType());
        System.out.println("Balance: " + balance);
    }
}
