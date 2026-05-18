package martins.dev.javaoneforall.introduction;

/**
 * Given a car's total price, for example 20_000
 * I want to find how much and for how long I'll have to pay monthly.
 * Condition: The monthly payment cannot be lower than 1000.
 */
public class Class06LoopStatement04 {
    public static void main(String[] args) {
        double carTotalPrice = 20_000;

        for (int i = 1; i < carTotalPrice; i++) {
            double monthlyPayment = carTotalPrice / i;
            if (monthlyPayment < 1000) {
                break;
            }
            System.out.println(i + " x " + monthlyPayment);
        }
    }
}
