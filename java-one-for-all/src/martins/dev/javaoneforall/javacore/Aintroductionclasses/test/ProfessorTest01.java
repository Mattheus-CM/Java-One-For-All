package martins.dev.javaoneforall.javacore.Aintroductionclasses.test;

import martins.dev.javaoneforall.javacore.Aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Mary";
        professor.age = 24;
        professor.gender = 'F';

        System.out.println(professor.name);
        System.out.println(professor.age);
        System.out.println(professor.gender);
    }
}
