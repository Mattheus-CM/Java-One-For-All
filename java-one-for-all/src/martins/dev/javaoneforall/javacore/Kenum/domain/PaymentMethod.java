package martins.dev.javaoneforall.javacore.Kenum.domain;

public enum PaymentMethod {
    DEBIT {
        @Override
        public double calculateDiscount(double value) {
            return value * 0.10;
        }
    }, CREDIT {
        @Override
        public double calculateDiscount(double value) {
            return value * 0.05;
        }
    };

    public abstract double calculateDiscount(double value);
}
