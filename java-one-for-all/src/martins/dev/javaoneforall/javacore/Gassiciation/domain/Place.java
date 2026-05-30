package martins.dev.javaoneforall.javacore.Gassiciation.domain;

public class Place {
    private String address;

    public Place(String address) {
        this.address = address;
    }

    public void print() {
        System.out.println("Address: " + address);
    }

    public String getAddress() {
        return address;
    }
}
