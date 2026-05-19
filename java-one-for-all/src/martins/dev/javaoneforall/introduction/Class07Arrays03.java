package martins.dev.javaoneforall.introduction;

public class Class07Arrays03 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numbers1 = {1,2,3,4};
        int[] numbers2 = new int[]{1,2,3,4,5,6};

        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }

        System.out.println("--------");

        for(int number:numbers2){
            System.out.println(number);
        }
    }
}
