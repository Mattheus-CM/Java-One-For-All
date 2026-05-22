package martins.dev.javaoneforall.javacore.Bintroductionmethods.test;

import martins.dev.javaoneforall.javacore.Bintroductionmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("John");
        employee.setAge(21);
        employee.setSalaries(new double[]{2000, 2400, 2550});

        employee.print();
    }
}
