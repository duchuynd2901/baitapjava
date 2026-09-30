package productinventory;

import java.util.ArrayList;

public class ProductArrayList {

    private ArrayList<Product> products;

    public ProductArrayList() {
        products = new ArrayList<>();
    }

    // a. Add product
    public void addProductToArrayList(Product product) {
        products.add(product);
        System.out.println("Product added successfully!");
    }

    // b. Update product by ID
    public void updateProductById(String id) {

        for (Product product : products) {

            if (product.getId().equalsIgnoreCase(id)) {

                product.updateProduct();

                System.out.println("Product updated successfully!");
                return;
            }
        }

        System.out.println("Product not found!");
    }

    // c. Delete product by ID
    public void deleteProductById(String id) {

        for (Product product : products) {

            if (product.getId().equalsIgnoreCase(id)) {

                products.remove(product);

                System.out.println("Product deleted successfully!");
                return;
            }
        }

        System.out.println("Product not found!");
    }

    // d. Display all products
    public void displayAllProducts() {

        if (products.isEmpty()) {
            System.out.println("Product list is empty!");
            return;
        }

        for (Product product : products) {
            product.displayDetails();
            System.out.println("----------------------------");
        }
    }

    // e. Display available products
    public void displayAvailableProducts() {

        boolean found = false;

        for (Product product : products) {

            if (product.isAvailable()) {

                product.displayDetails();
                System.out.println("----------------------------");

                found = true;
            }
        }

        if (!found) {
            System.out.println("No available products!");
        }
    }

    // f. Find highest selling price
    public double findHighestPrice() {

        if (products.isEmpty()) {
            return 0;
        }

        double highestPrice = 0;

        for (Product product : products) {

            double price = product.calculatePrice();

            if (price > highestPrice) {
                highestPrice = price;
            }
        }

        return highestPrice;
    }
}