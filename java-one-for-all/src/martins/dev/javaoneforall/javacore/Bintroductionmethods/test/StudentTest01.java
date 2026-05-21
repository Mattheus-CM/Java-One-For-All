package martins.dev.javaoneforall.javacore.Bintroductionmethods.test;

import martins.dev.javaoneforall.javacore.Bintroductionmethods.domain.Student;
import martins.dev.javaoneforall.javacore.Bintroductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        StudentPrinter printer = new StudentPrinter();

        student01.name = "Midorya";
        student01.age = 15;
        student01.gender = 'M';

        student02.name = "Sakura";
        student02.age = 16;
        student02.gender = 'F';

        printer.print(student01);
        printer.print(student02);

        System.out.println("#############################################");

        printer.print(student01);
        printer.print(student02);
    }
}
