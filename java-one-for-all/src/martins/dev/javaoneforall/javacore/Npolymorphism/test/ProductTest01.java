package martins.dev.javaoneforall.javacore.Npolymorphism.test;

import martins.dev.javaoneforall.javacore.Npolymorphism.domain.Computer;
import martins.dev.javaoneforall.javacore.Npolymorphism.domain.Television;
import martins.dev.javaoneforall.javacore.Npolymorphism.domain.Tomato;
import martins.dev.javaoneforall.javacore.Npolymorphism.service.ProductTaxReportService;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 1000);
        Tomato tomato = new Tomato("Italian", 5);
        Television television = new Television("Samsung 50\"", 2500);

        ProductTaxReportService.generateProductTaxReport(computer);
        System.out.println("------------------------------");
        ProductTaxReportService.generateProductTaxReport(tomato);
        System.out.println("------------------------------");
        ProductTaxReportService.generateProductTaxReport(television);
    }
}
