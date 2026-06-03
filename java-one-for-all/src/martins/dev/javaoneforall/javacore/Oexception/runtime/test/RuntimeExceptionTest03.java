package martins.dev.javaoneforall.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        System.out.println(openConnection());
    }

    private static String openConnection() {
        try {
            System.out.println("Opening Connection");
            System.out.println("Writting to the database");
            if (true) {throw new RuntimeException();}
            return "Connected";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Close connection");
        }
        return "Not connected";
    }
}
