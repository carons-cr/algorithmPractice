package algorithmPractice.src.section1_basic.section1_1_practices;

public class Practice1_1_13 {
    public static void main(String[] args) {
        int[][] mn = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        Practice1_1_13.exercise1_1_13(mn);
    }

    private static void exercise1_1_13(int[][] mn) {
        int[][] nm = new int[mn[0].length][mn.length];
        System.out.println("二维数组mn： ");
        for (int i = 0; i < mn.length; i++) {
            for (int j = 0; j < mn[i].length; j++) {
                int t = mn[i][j];
                nm[j][i] = t;
                System.out.print(mn[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("mn的转置数组nm： ");
        for (int i = 0; i < nm.length; i++) {
            for (int j = 0; j < nm[i].length; j++) {
                System.out.print(nm[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
