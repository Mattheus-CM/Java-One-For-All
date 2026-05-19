package martins.dev.javaoneforall.introduction;

public class Class08MultidimensionalArrays02 {
    public static void main(String[] args) {
        int[][] numbers = new int[][]{
                {1, 2},
                {3, 4, 5},
                {6, 7, 8, 9}};

        for (int[] baseArray : numbers) {
            for (int number : baseArray) {
                System.out.print(number + " ");
            }
        }

        System.out.print("\n--------------------");

        int[][] numbers2 = new int[3][];
        int[] numbersTest = {1, 2, 3};

        numbers2[0] = new int[]{1, 2};
        numbers2[1] = numbersTest;
        numbers2[2] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int[] baseArray : numbers2) {
            System.out.println();
            for (int number : baseArray) {
                System.out.print(number + " ");
            }
        }
    }
}
