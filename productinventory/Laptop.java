package productinventory;

import java.util.Date;

public class Laptop extends Product {

    private int warrantyYears;
    private double discountPercent;

    // Constructor
    public Laptop(String id, double basePrice, Date importDate,
                  boolean isAvailable, int quantity,
                  int warrantyYears, double discountPercent) {

        super(id, basePrice, importDate, isAvailable, quantity);

        this.warrantyYears = warrantyYears;
        this.discountPercent = discountPercent;
    }

    // Getter và Setter
    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    // Add Laptop
    @Override
    public void addProduct() {
        super.addProduct();

        System.out.print("Enter warranty years: ");
        warrantyYears = Integer.parseInt(sc.nextLine());

        System.out.print("Enter discount percent: ");
        discountPercent = Double.parseDouble(sc.nextLine());
    }

    // Update Laptop
    @Override
    public void updateProduct() {
        super.updateProduct();

        System.out.print("Enter new warranty years: ");
        warrantyYears = Integer.parseInt(sc.nextLine());

        System.out.print("Enter new discount percent: ");
        discountPercent = Double.parseDouble(sc.nextLine());
    }

    // Display Laptop
    @Override
    public void displayDetails() {
        System.out.println("----- LAPTOP -----");

        super.displayDetails();

        System.out.println("Warranty Years: " + warrantyYears);
        System.out.println("Discount Percent: " + discountPercent + "%");
        System.out.println("Selling Price: " + calculatePrice());
    }

    // Calculate Laptop price
    @Override
    public double calculatePrice() {

        double warrantyFee;

        if (warrantyYears >= 3) {
            warrantyFee = getBasePrice() * 0.08;
        } else {
            warrantyFee = getBasePrice() * 0.03;
        }

        double sellingPrice =
                (getBasePrice() + warrantyFee)
                * (1 - discountPercent / 100);

        return sellingPrice;
    }
}