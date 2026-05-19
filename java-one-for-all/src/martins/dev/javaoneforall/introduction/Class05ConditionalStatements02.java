package martins.dev.javaoneforall.introduction;

public class Class05ConditionalStatements02 {
    public static void main(String[] args) {
        short age = 18;
        boolean isJunior = age < 15;
        boolean isSenior = age < 18;
        // boolean isMasters = age >= 18;
        if (isJunior) {
            System.out.println("You are Junior");
        } else if (isSenior) {
            System.out.println("You are Senior");
        } else {
            System.out.println("You are Masters");
        }
    }
}
