package martins.dev.javaoneforall.javacore.Bintroductionmethods.domain;

public class Employee {
    public String name;
    public short age;
    public double[] salaries;

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
        double sum = 0;
        for (double salary : salaries) {
            sum += salary;
        }
        System.out.println("Average salary: " + sum / salaries.length);
    }
}
