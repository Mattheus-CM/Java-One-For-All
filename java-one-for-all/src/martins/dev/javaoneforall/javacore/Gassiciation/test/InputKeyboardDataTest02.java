package martins.dev.javaoneforall.javacore.Gassiciation.test;

import java.util.Scanner;

public class InputKeyboardDataTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the most advanced AI system MIA");
        System.out.println("Ask any question and I shall reply yes or no");
        String question = scanner.nextLine();
        if (question.charAt(0) == ' ') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
