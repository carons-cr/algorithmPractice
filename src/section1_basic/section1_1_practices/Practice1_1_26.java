package section1_basic.section1_1_practices;

public class Practice1_1_26 {
    public static void main(String[] args) {
        Practice1_1_26.ascendingSort(8, 2, 3);
    }
    private static void ascendingSort(int a, int b, int c) {
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            int t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            int t = b;
            b = c;
            c = t;
        }
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
