package martins.dev.javaoneforall.introduction;

/**
 * Given a car's total price, for example 20_000
 * I want to find how much and for how long I'll have to pay monthly.
 * Condition: The monthly payment cannot be lower than 1000.
 */
public class Class06LoopStatement05 {
    public static void main(String[] args) {
        double carTotalPrice = 20_000;

        for (int i = (int) carTotalPrice; i >= 1; i--) {
            double monthlyPayment = carTotalPrice / i;
            if (monthlyPayment < 1000) {
                continue;
            }
            System.out.println(i + " x " + monthlyPayment);
        }
    }
}
