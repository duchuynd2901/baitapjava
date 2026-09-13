package lec08.bankaccount;

import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public boolean withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }

        return false;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }

    public void addInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        accountNumber = sc.nextLine();

        System.out.print("Enter owner: ");
        owner = sc.nextLine();

        System.out.print("Enter initial balance: ");
        balance = sc.nextInt();
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.addInfo();

        System.out.println("\nInitial account information:");
        account.display();

        System.out.println("\nDepositing 500:");
        account.deposit(500);

        System.out.println("\nWithdrawing 200:");
        boolean result = account.withdraw(200);

        if (result) {
            System.out.println("Withdraw successful!");
        } else {
            System.out.println("Withdraw failed!");
        }

        System.out.println("\nFinal account information:");
        account.display();
    }
}