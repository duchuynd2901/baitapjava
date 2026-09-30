package productinventory;

import java.util.Date;

public class Smartphone extends Product {

    private int storageGB;
    private double taxPercent;

    // Constructor
    public Smartphone(String id, double basePrice, Date importDate,
                      boolean isAvailable, int quantity,
                      int storageGB, double taxPercent) {

        super(id, basePrice, importDate, isAvailable, quantity);

        this.storageGB = storageGB;
        this.taxPercent = taxPercent;
    }

    // Getter và Setter
    public int getStorageGB() {
        return storageGB;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    public double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    // Add Smartphone
    @Override
    public void addProduct() {
        super.addProduct();

        System.out.print("Enter storage GB: ");
        storageGB = Integer.parseInt(sc.nextLine());

        System.out.print("Enter tax percent: ");
        taxPercent = Double.parseDouble(sc.nextLine());
    }

    // Update Smartphone
    @Override
    public void updateProduct() {
        super.updateProduct();

        System.out.print("Enter new storage GB: ");
        storageGB = Integer.parseInt(sc.nextLine());

        System.out.print("Enter new tax percent: ");
        taxPercent = Double.parseDouble(sc.nextLine());
    }

    // Display Smartphone
    @Override
    public void displayDetails() {
        System.out.println("----- SMARTPHONE -----");

        super.displayDetails();

        System.out.println("Storage: " + storageGB + " GB");
        System.out.println("Tax Percent: " + taxPercent + "%");
        System.out.println("Selling Price: " + calculatePrice());
    }

    // Calculate Smartphone price
    @Override
    public double calculatePrice() {

        double storageFee;

        if (storageGB >= 512) {
            storageFee = getBasePrice() * 0.15;
        } else if (storageGB >= 256) {
            storageFee = getBasePrice() * 0.10;
        } else {
            storageFee = getBasePrice() * 0.05;
        }

        double sellingPrice =
                (getBasePrice() + storageFee)
                * (1 + taxPercent / 100);

        return sellingPrice;
    }
}