package martins.dev.javaoneforall.javacore.Hinheritance.domain;

public class Address {
    private String street;
    private String zipCode;

    public void print(){
        System.out.println(street + " " + zipCode);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
