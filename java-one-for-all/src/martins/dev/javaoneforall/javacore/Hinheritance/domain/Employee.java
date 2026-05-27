package martins.dev.javaoneforall.javacore.Hinheritance.domain;

public class Employee {
    protected String name;
    protected String socialSecurityNumber;
    protected double salary;
    protected Address address;

    static {
        System.out.println("Employee static init block");
    }

    {
        System.out.println("Employee init block 1");
    }

    {
        System.out.println("Employee init block 2");
    }

    public Employee(String name) {
        System.out.println("Inside Employee constructor");
        this.name = name;
    }

    public void print() {

        System.out.println("Name: " + name);
        System.out.println("Social Security Number: " + socialSecurityNumber);
        System.out.println("Salary: " + salary);
        System.out.print("Address: ");
        address.print();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
