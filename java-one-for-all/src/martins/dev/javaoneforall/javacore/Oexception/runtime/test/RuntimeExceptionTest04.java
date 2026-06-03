package martins.dev.javaoneforall.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException |
                 ArithmeticException e) {
            System.out.println("inside ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("inside RuntimeException");
        }

        try {
            mayThrowException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void mayThrowException() throws SQLException, FileNotFoundException {

    }
}
