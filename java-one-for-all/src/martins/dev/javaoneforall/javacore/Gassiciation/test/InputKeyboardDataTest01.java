package martins.dev.javaoneforall.javacore.Gassiciation.test;

import java.util.Scanner;

public class InputKeyboardDataTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type your name: ");
        String name = scanner.nextLine();
        System.out.print("Please type your age: ");
        int age = scanner.nextInt();
        System.out.print("Please type your gender: ");
        char gender = scanner.next().charAt(0);

        System.out.println("--- Your data ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
