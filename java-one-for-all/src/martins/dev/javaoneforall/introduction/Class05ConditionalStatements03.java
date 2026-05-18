package martins.dev.javaoneforall.introduction;

public class Class05ConditionalStatements03 {
    public static void main(String[] args) {
        // salary > $2000 "buy" / "don't buy"
        double salary = 3000;
        String message = salary > 2000 ? "Buy" : "Don't buy";
        System.out.println("Can i buy the ps5? " + message);
    }
}
