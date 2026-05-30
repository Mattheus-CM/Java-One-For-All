package martins.dev.javaoneforall.javacore.Npolymorphism.test;

import martins.dev.javaoneforall.javacore.Npolymorphism.domain.Computer;
import martins.dev.javaoneforall.javacore.Npolymorphism.domain.Product;
import martins.dev.javaoneforall.javacore.Npolymorphism.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 7", 2000);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.calculateTaxValue());
        System.out.println();
        Product product2 = new Tomato("Italian", 20);
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.calculateTaxValue());
    }
}
