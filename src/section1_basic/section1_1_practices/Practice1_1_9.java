package section1_basic.section1_1_practices;

public class Practice1_1_9 {
    public static void main(String[] args) {
        Practice1_1_9.exercise1_1_9();
    }

    private static void exercise1_1_9() {
        int N = 9;
        String s = "";
        for (int i = N; i > 0; i /= 2) {
            s = i%2 + s;
        }
        System.out.println(s);//1001
    }
}
