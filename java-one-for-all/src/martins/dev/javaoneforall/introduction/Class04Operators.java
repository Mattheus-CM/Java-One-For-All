package martins.dev.javaoneforall.introduction;

public class Class04Operators {
    public static void main(String[] args) {
        double number1 = 10;
        double number2 = 20;
        double result = number1 / number2;
        System.out.println(result);

        double modulo = number2 % number1;
        System.out.println(modulo);

        boolean isNumberOneGreaterThanNumberTwo = number1 > number2;
        System.out.println("isNumberOneGreaterThanNumberTwo - " + isNumberOneGreaterThanNumberTwo);

        boolean isNumberOneLessThanNumberTwo = number1 < number2;

        boolean resultBoolean = isNumberOneLessThanNumberTwo || isNumberOneGreaterThanNumberTwo;

        int counter = 0;
        counter += 1;
        counter += 1;
        counter += 1;
        System.out.println(counter);

        counter++;
        System.out.println(counter);
    }
}
