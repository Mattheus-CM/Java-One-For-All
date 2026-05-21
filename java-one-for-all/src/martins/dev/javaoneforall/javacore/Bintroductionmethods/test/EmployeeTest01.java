package martins.dev.javaoneforall.javacore.Bintroductionmethods.test;

import martins.dev.javaoneforall.javacore.Bintroductionmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "John";
        employee.age = 21;
        employee.salaries = new double[]{2000, 2400, 2550};

        employee.print();
    }
}
