package martins.dev.javaoneforall.javacore.Oexception.exception.test;

import martins.dev.javaoneforall.javacore.Oexception.exception.domain.Employee;
import martins.dev.javaoneforall.javacore.Oexception.exception.domain.LoginInvalidException;
import martins.dev.javaoneforall.javacore.Oexception.exception.domain.Person;

import java.io.FileNotFoundException;

public class OverridingWithExceptionsTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.save();
        } catch (LoginInvalidException | FileNotFoundException e) {
            e.printStackTrace();
        }

        Employee employee = new Employee();
        try {
            employee.save();
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }
}
