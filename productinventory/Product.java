package productinventory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Product implements IProduct {

    private String id;
    private double basePrice;
    private Date importDate;
    private boolean isAvailable;
    private int quantity;

    protected Scanner sc = new Scanner(System.in);

    // Câu 18: Constructor
    public Product(String id, double basePrice, Date importDate,
                   boolean isAvailable, int quantity) {
        this.id = id;
        this.basePrice = basePrice;
        this.importDate = importDate;
        this.isAvailable = isAvailable;
        this.quantity = quantity;
    }

    // Getter và Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Câu 19: Add product
    @Override
    public void addProduct() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter ID: ");
        id = sc.nextLine();

        System.out.print("Enter base price: ");
        basePrice = Double.parseDouble(sc.nextLine());

        System.out.print("Enter import date (dd/MM/yyyy): ");
        String date = sc.nextLine();

        try {
            importDate = sdf.parse(date);
        } catch (ParseException e) {
            System.out.println("Invalid date!");
        }

        System.out.print("Is available (true/false): ");
        isAvailable = Boolean.parseBoolean(sc.nextLine());

        System.out.print("Enter quantity: ");
        quantity = Integer.parseInt(sc.nextLine());
    }

    // Câu 20: Update product
    @Override
    public void updateProduct() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter new base price: ");
        basePrice = Double.parseDouble(sc.nextLine());

        System.out.print("Enter new import date (dd/MM/yyyy): ");
        String date = sc.nextLine();

        try {
            importDate = sdf.parse(date);
        } catch (ParseException e) {
            System.out.println("Invalid date!");
        }

        System.out.print("Is available (true/false): ");
        isAvailable = Boolean.parseBoolean(sc.nextLine());

        System.out.print("Enter new quantity: ");
        quantity = Integer.parseInt(sc.nextLine());
    }

    // Câu 21: Display common information
    @Override
    public void displayDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("ID: " + id);
        System.out.println("Base Price: " + basePrice);
        System.out.println("Import Date: " + sdf.format(importDate));
        System.out.println("Available: " + isAvailable);
        System.out.println("Quantity: " + quantity);
    }
}