package algorithmPractice.src.section1_basic.section1_1_practices;

public class Practice1_1_17 {
    public static void main(String[] args) {
        System.out.println(Practice1_1_17.exR2(6));
    }
    private static String exR2(int n) {//Exception in thread "main" java.lang.StackOverFlowError.
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0) {
            return "";
        }
        return s;
    }

}
