package section1_basic.section1_1_practices;

public class Practice1_1_7 {
    public static void main(String[] args) {
        Practice1_1_7.exercise1_1_7();
    }

    private static void exercise1_1_7() {
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001) {
            t = (t + 9.0/t)/2;
        }
        System.out.println(t);  //3.00009155413138

        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);  //1023

        int sum2 = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum2++;
            }
        }
        System.out.println(sum2);  //10000
    }
}
