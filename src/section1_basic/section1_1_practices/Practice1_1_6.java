package section1_basic.section1_1_practices;

public class Practice1_1_6 {
    public static void main(String[] args) {
        Practice1_1_6.exercise1_1_6();
    }

    private static void exercise1_1_6() {
        int f = 0;
        int g = 1;
        for (int i = 0;i < 15; i++) {
            System.out.print(f + "\t");//0,1,1,2,3,5,8,13,21,34,55,89,144,233,377
            f = f + g;//1,1,2,3,5,8,13,21,34,55,89,144,233,377,610
            System.out.print(f + "\t");
            g = f - g;//0,1,1,2,3,5,8,13,21,34,55,89,144,233,377
            System.out.print(g + "\n");
        }
    }
}
