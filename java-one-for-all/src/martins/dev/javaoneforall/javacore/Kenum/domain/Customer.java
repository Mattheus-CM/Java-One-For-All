package martins.dev.javaoneforall.javacore.Kenum.domain;

public class Customer {
    private String name;
    private CustomerType customerType;
    private PaymentMethod paymentMethod;

    public Customer(String name, CustomerType customerType, PaymentMethod paymentMethod) {
        this.name = name;
        this.customerType = customerType;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerType=" + customerType.getReportValue() +
                ", customerTypeDatabase=" + customerType.getDbValue() +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}
