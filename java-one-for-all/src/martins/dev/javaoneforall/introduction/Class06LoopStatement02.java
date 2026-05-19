package martins.dev.javaoneforall.introduction;

/**
 * Just print the even numbers from 0 to 1_000_000
 */
public class Class06LoopStatement02 {
    public static void main(String[] args) {
        for (int i = 0; i <= 1_000_000; i++){
            if (i % 2 == 0){
                System.out.print("Even - ");
            }
            System.out.println(i);
        }
    }
}
