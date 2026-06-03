package martins.dev.javaoneforall.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        division(1, 0);
    }

    private static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("The second parameter can't be 0");
        }
        return a / b;
    }
}
