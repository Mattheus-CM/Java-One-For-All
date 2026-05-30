package martins.dev.javaoneforall.javacore.Bintroductionmethods.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;
    private double average;

    public void print() {
        System.out.println("--------------------------");
        System.out.println("Employee");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        if (this.salaries != null) {
            System.out.print("Salaries: ");
            for (double salary : salaries) {
                System.out.print(salary + " ");
            }
        }
        System.out.println();
        calculateAverageSalary();
    }

    public void calculateAverageSalary() {
        if (salaries == null) return;
        for (double salary : salaries) {
            average += salary;
        }
        System.out.println("Average salary: " + average / salaries.length);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public double getAverage() {
        return average;
    }
}
