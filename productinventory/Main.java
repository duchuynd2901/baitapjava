package productinventory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProductArrayList productList = new ProductArrayList();

        int choice;

        do {

            System.out.println("\n========== PRODUCT INVENTORY MANAGEMENT ==========");
            System.out.println("1. Add Laptop");
            System.out.println("2. Add Smartphone");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Display All Products");
            System.out.println("6. Display Available Products");
            System.out.println("7. Find Highest Selling Price");
            System.out.println("0. Exit");
            System.out.println("==================================================");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    Laptop laptop = new Laptop(
                            "",
                            0,
                            null,
                            false,
                            0,
                            0,
                            0
                    );

                    laptop.addProduct();

                    productList.addProductToArrayList(laptop);

                    break;

                case 2:

                    Smartphone smartphone = new Smartphone(
                            "",
                            0,
                            null,
                            false,
                            0,
                            0,
                            0
                    );

                    smartphone.addProduct();

                    productList.addProductToArrayList(smartphone);

                    break;

                case 3:

                    System.out.print("Enter product ID to update: ");
                    String updateId = sc.nextLine();

                    productList.updateProductById(updateId);

                    break;

                case 4:

                    System.out.print("Enter product ID to delete: ");
                    String deleteId = sc.nextLine();

                    productList.deleteProductById(deleteId);

                    break;

                case 5:

                    productList.displayAllProducts();

                    break;

                case 6:

                    productList.displayAvailableProducts();

                    break;

                case 7:

                    double highestPrice =
                            productList.findHighestPrice();

                    System.out.println(
                            "Highest Selling Price: "
                            + highestPrice
                    );

                    break;

                case 0:

                    System.out.println("Program exited!");

                    break;

                default:

                    System.out.println("Invalid choice!");

            }

        } while (choice != 0);

        sc.close();
    }
}