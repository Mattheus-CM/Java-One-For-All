package martins.dev.javaoneforall.javacore.Bintroductionmethods.test;

import martins.dev.javaoneforall.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.divideTwoNumbers(0, 0));
        System.out.println(calculator.divideTwoNumbers02(1, 1));
        calculator.printTwoNumbersDivided(1, 1);
    }
}
