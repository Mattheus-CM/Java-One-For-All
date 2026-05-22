package martins.dev.javaoneforall.javacore.Bintroductionmethods.test;

import martins.dev.javaoneforall.javacore.Bintroductionmethods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("John");
        person.setAge(-32);

        person.print();
    }
}
