package martins.dev.javaoneforall.javacore.Oexception.exception.test;

import martins.dev.javaoneforall.javacore.Oexception.exception.domain.LoginInvalidException;

import java.util.Scanner;

public class LoginInvalidExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws LoginInvalidException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "admin";
        String passwordDB = "admin";
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        if (!username.equals(usernameDB) || !password.equals(passwordDB)) {
            throw new LoginInvalidException("Wrong username or password");
        }

        System.out.println("Login Successful");
    }
}
