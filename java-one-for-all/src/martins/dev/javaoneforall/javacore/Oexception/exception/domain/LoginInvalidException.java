package martins.dev.javaoneforall.javacore.Oexception.exception.domain;

public class LoginInvalidException extends Exception {
    public LoginInvalidException() {
        super("Login Invalid");
    }

    public LoginInvalidException(String message) {
        super(message);
    }
}
