package martins.dev.javaoneforall.javacore.Aintroductionclasses.test;

import martins.dev.javaoneforall.javacore.Aintroductionclasses.domain.Car;

/**
 * Create a Class Car with the following attributes: name, Model, year
 * Then, create two distinct objects and print their value.
 */

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "BMW";
        car1.model = "x6";
        car1.year = 2025;

        Car car2 = new Car();
        car2.name = "Chevrolet";
        car2.model = "Opala";
        car2.year = 1969;

        System.out.println("Car\nName: " + car1.name
                + "\nModel: " + car1.model
                + "\nYear: " + car1.year);
        System.out.println();
        System.out.println("Car\nName: " + car2.name
                + "\nModel: " + car2.model
                + "\nYear: " + car2.year);
    }
}
