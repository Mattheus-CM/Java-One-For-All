package martins.dev.javaoneforall.javacore.Hinheritance.test;

import martins.dev.javaoneforall.javacore.Hinheritance.domain.Address;
import martins.dev.javaoneforall.javacore.Hinheritance.domain.Employee;
import martins.dev.javaoneforall.javacore.Hinheritance.domain.Manager;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Bobo's Street");
        address.setZipCode("12345");

        Employee employee = new Employee("Goku");
        employee.setSocialSecurityNumber("123456789");
        employee.setSalary(10000);
        employee.setAddress(address);

        employee.print();

        System.out.println();
        System.out.println();

        Manager manager = new Manager("Vegeta");
        manager.setSocialSecurityNumber("123456790");
        manager.setSalary(100000);
        manager.setAddress(address);
        manager.setDepartment("IT");
        manager.print();
    }
}
