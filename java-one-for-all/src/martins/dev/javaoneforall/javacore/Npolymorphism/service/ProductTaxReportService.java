package martins.dev.javaoneforall.javacore.Npolymorphism.service;

import martins.dev.javaoneforall.javacore.Npolymorphism.domain.Product;
import martins.dev.javaoneforall.javacore.Npolymorphism.domain.Tomato;

public class ProductTaxReportService {

    public static void generateProductTaxReport(Product product) {
        System.out.println("Starting Generating the Tax Report");
        double taxValue = product.calculateTaxValue();
        System.out.println("Product: "+ product.getName());
        System.out.println("Price: "+ product.getPrice());
        System.out.println("Tax value: "+ taxValue);
        if (product instanceof Tomato) {
            System.out.println("Best consumed before : "+ ((Tomato) product).getBestConsumedBefore());
        }
    }
}
