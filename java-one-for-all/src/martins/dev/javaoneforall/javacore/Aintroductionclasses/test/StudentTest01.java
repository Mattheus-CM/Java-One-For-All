package martins.dev.javaoneforall.javacore.Aintroductionclasses.test;

import martins.dev.javaoneforall.javacore.Aintroductionclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Mbappé";
        student.age = 27;
        student.gender = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
