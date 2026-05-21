package martins.dev.javaoneforall.javacore.Bintroductionmethods.domain;

public class Calculator {

    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(21 - 10);
    }

    public void multipleTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2) {
        if (num1 == 0 || num2 == 0) return 0;
        return num1 / num2;
    }

    public double divideTwoNumbers02(double num1, double num2) {
        if (num1 != 0 && num2 != 0) return num1 / num2;
        return 0;
    }

    public void printTwoNumbersDivided(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Can't divide by zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void changeTwoNumbers(double num1, double num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Inside changeTwoNumbers");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }

    public void sumArray(int[] numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(double first, int... numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        System.out.println(sum);
    }
}
