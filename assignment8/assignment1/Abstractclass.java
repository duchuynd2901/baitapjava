package lec10.assignment1;

public abstract class Abstractclass {

    private String name;

    public Abstractclass(String name) {
        this.name = name;
    }

    public void diagram() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayinfor() {
        System.out.println("name: " + getName());
    }

    public abstract double caculateSalary();
}