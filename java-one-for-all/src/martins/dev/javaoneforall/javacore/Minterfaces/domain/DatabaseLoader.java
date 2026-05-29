package martins.dev.javaoneforall.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading Data from database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing Data from database...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission in the database...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Inside retrieveMaxDataSize in the DatabaseLoader class...");
    }
}
