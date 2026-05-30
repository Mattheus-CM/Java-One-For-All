package martins.dev.javaoneforall.javacore.Npolymorphism.test;

import martins.dev.javaoneforall.javacore.Npolymorphism.domain.Computer;
import martins.dev.javaoneforall.javacore.Npolymorphism.domain.Product;
import martins.dev.javaoneforall.javacore.Npolymorphism.domain.Tomato;
import martins.dev.javaoneforall.javacore.Npolymorphism.service.ProductTaxReportService;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 7", 2000);

        Tomato tomato = new Tomato("Italian", 20);
        tomato.setBestConsumedBefore("12/06/2026");

        ProductTaxReportService.generateProductTaxReport(tomato);
        System.out.println("------------------------");
        ProductTaxReportService.generateProductTaxReport(product);
    }
}
