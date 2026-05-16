package martins.dev.javaoneforall.introduction;

/**
 * Create variables for the fields described below between /\ and print the following message:
 * I /name\, living at /address\, confirm that I received the salary of /salary\ on /date\
 */

public class Class03PrimitiveTypesExercise {
    public static void main(String[] args) {
        String name = "Martins";
        String address = "Rua dos Bobos, 0, Centro";
        double salary = 3000.0;
        //dd/MM/yyyy
        String receivedSalaryDate = "16/05/2026";
        System.out.println("I " + name + ", living at " + address
                + ", confirm that I received the salary of " + salary + " on " + receivedSalaryDate);
    }
}
