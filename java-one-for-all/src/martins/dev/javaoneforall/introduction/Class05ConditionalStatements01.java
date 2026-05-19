package martins.dev.javaoneforall.introduction;

public class Class05ConditionalStatements01 {
    public static void main(String[] args) {
        short age = 17;
        boolean isAnAdult = age >= 18;
        if (isAnAdult) {
            System.out.println("You are an Adult");
        } else {
            System.out.println("You are a child");
        }
    }
}