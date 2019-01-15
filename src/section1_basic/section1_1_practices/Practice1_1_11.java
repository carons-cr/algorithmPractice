package section1_basic.section1_1_practices;

public class Practice1_1_11 {
    public static void main(String[] args) {
        Practice1_1_11.exercise1_1_11();
    }

    private static void exercise1_1_11() {
        boolean[][] booleans = new boolean[][]{{true, false, true},{false, true}};
        for (int i = 0; i < booleans.length; i++) {
            for (int j = 0; j < booleans[i].length; j++ ) {
                if (booleans[i][j]) {
                    System.out.print("(" + i + ", " + j + ")" + "*" + "\t");
                }else {
                    System.out.print("(" + i + ", " + j + ")" + " " + "\t");
                }
            }
            System.out.println();
        }
    }
}
