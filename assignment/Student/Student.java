package lec08.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private ArrayList<Double> grades;
    public Student() {
        grades = new ArrayList<>();
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 10) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade!");
        }
    }

    public double getAverage() {
        if (grades.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }
    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + getAverage());
    }
    public void addInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        id = sc.nextLine();

        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.print("Enter number of grades: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            double grade = sc.nextDouble();

            addGrade(grade);
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.addInfo();

        System.out.println("\nStudent Information:");
        student.display();
    }
}