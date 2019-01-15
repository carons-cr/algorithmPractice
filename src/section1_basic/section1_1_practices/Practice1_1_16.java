package section1_basic.section1_1_practices;

public class Practice1_1_16 {
    public static void main(String[] args) {
        System.out.println(Practice1_1_16.exR1(6));
    }

    private static String exR1(int n) {//311361142246
        if (n <= 0) {
            return "";
        }
        return exR1(n - 3) + n + exR1(n -2 ) + n;
    }
}
