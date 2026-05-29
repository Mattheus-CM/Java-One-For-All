package martins.dev.javaoneforall.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading Data from file...");
    }

    @Override
    public void remove() {
        System.out.println("Removing Data from file...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission in the file...");
    }
}
