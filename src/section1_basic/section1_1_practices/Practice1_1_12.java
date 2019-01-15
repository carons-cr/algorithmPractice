package section1_basic.section1_1_practices;

public class Practice1_1_12 {
    public static void main(String[] args) {
        Practice1_1_12.exercise1_1_12();
    }

    private static void exercise1_1_12() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t");//0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        }
    }
}
