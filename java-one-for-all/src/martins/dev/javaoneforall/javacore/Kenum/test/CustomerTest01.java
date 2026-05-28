package martins.dev.javaoneforall.javacore.Kenum.test;

import martins.dev.javaoneforall.javacore.Kenum.domain.Customer;

import martins.dev.javaoneforall.javacore.Kenum.domain.CustomerType;
import martins.dev.javaoneforall.javacore.Kenum.domain.PaymentMethod;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Kakaroto", CustomerType.INDIVIDUAL, PaymentMethod.DEBIT);
        Customer customer2 = new Customer("Vegeta", CustomerType.COMPANY, PaymentMethod.CREDIT);

        System.out.println(customer1);
        System.out.println(customer2);

        System.out.println(PaymentMethod.DEBIT.calculateDiscount(100));
        System.out.println(PaymentMethod.CREDIT.calculateDiscount(100));

        System.out.println(CustomerType.getByReportValue("start up"));
    }
}
