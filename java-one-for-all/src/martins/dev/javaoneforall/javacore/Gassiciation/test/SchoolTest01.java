package martins.dev.javaoneforall.javacore.Gassiciation.test;

import martins.dev.javaoneforall.javacore.Gassiciation.domain.Professor;
import martins.dev.javaoneforall.javacore.Gassiciation.domain.School;

public class SchoolTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        School school1 = new School("Konoha", new Professor[]{professor1, professor2});

        school1.print();
    }
}
