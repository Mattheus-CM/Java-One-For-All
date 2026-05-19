package martins.dev.javaoneforall.introduction;

public class Class06LoopStatement01 {
    public static void main(String[] args) {
        byte counter = 13;
        while (counter < 10) {
            System.out.println(++counter);
        }

        do {
            System.out.println(++counter);
            System.out.println();
        } while (counter < 10);


        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
        }
    }
}
