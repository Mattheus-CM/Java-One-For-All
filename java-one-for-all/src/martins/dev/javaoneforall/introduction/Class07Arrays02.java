package martins.dev.javaoneforall.introduction;

public class Class07Arrays02 {
    public static void main(String[] args) {
        String[] names = new String[3];

        names[0] = "John";
        names[1] = "Martins";
        names[2] = "Goku";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
