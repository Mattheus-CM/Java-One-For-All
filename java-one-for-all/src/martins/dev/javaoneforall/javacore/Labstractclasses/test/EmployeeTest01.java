package martins.dev.javaoneforall.javacore.Labstractclasses.test;

import martins.dev.javaoneforall.javacore.Labstractclasses.domain.Developer;
import martins.dev.javaoneforall.javacore.Labstractclasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Kakuzu", 5000);
        System.out.println(manager);

        Developer developer = new Developer("Deidara", 12000);
        System.out.println(developer);

        manager.print();
        developer.print();
    }
}
