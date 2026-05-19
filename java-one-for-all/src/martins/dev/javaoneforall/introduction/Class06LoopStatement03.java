package martins.dev.javaoneforall.introduction;

/**
 * Given a total number, for example 50, print the first 25
 */
public class Class06LoopStatement03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++){
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
