package martins.dev.javaoneforall.javacore.Gassiciation.test;

import martins.dev.javaoneforall.javacore.Gassiciation.domain.Place;
import martins.dev.javaoneforall.javacore.Gassiciation.domain.Professor;
import martins.dev.javaoneforall.javacore.Gassiciation.domain.Seminar;
import martins.dev.javaoneforall.javacore.Gassiciation.domain.Student;

public class AssociationTest01 {
    public static void main(String[] args) {
        Place place = new Place("Land of Waves");

        Student student1 = new Student("Uzumaki Naruto", 14);
        Student student2 = new Student("Uchiha Sasuke", 14);
        Student student3 = new Student("Haruno Sakura", 14);
        Student[] students = {student1, student2, student3};

        Seminar seminar1 = new Seminar("Learn chakra control", students, place);
        Seminar[] seminars = {seminar1};

        Professor professor1 = new Professor("Kakashi", "Jutsu Copy", seminars);

        professor1.print();
    }
}
