package lec08.carprofile;

import java.util.Scanner;

public class CarProfile {
    private String make;
    private String model;
    private int year;

    public CarProfile() {
    }

    public CarProfile(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void addProfile() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter car make: ");
        make = sc.nextLine();

        System.out.print("Enter car model: ");
        model = sc.nextLine();

        System.out.print("Enter car year: ");
        year = sc.nextInt();
    }

    public void displayProfile() {
        System.out.println("Car Profile: "
                + make + " " + model + " (" + year + ")");
    }

    public static void main(String[] args) {
        CarProfile car = new CarProfile();

        car.addProfile();
        car.displayProfile();
    }
}