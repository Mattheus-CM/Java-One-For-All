package martins.dev.javaoneforall.javacore.Bintroductionmethods.test;

import martins.dev.javaoneforall.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest05 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        calculator.sumArray(numbers);
        calculator.sumVarArgs(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    }
}
