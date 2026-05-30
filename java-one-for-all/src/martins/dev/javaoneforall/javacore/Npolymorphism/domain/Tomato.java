package martins.dev.javaoneforall.javacore.Npolymorphism.domain;

public class Tomato extends Product {
    public static final double TAX_PERCENTAGE = 0.06;
    private String bestConsumedBefore;

    public Tomato(String name, double price) {
        super(name, price);
    }

    public String getBestConsumedBefore() {
        return bestConsumedBefore;
    }

    public void setBestConsumedBefore(String bestConsumedBefore) {
        this.bestConsumedBefore = bestConsumedBefore;
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating Tomato Tax Value");
        return this.price * TAX_PERCENTAGE;
    }
}
