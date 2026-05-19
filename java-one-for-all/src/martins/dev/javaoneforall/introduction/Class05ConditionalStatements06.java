package martins.dev.javaoneforall.introduction;

/**
 * Using switch, print if the day is business day or weekend
 */
public class Class05ConditionalStatements06 {
    public static void main(String[] args) {
        byte day = 4;

        switch (day) {
            case 1:
            case 7:
                System.out.println("Weekend day");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Business day");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
