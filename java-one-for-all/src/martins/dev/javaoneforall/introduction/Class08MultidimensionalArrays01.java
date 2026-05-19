package martins.dev.javaoneforall.introduction;

public class Class08MultidimensionalArrays01 {
    public static void main(String[] args) {
        int[][] numbers = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] baseArray : numbers){
            for (int num : baseArray){
                System.out.println(num);
            }
        }
    }
}
