package algorithmPractice.src.section1_basic.section1_1_practices;

public class Practice1_1_14 {
    public static void main(String[] args) {
        System.out.println(Practice1_1_14.lg(14));
    }

    private static int lg(int N) {
        int x = 0;
        int y = 1;
        while(y <= N) {
            x++;
            y = 2*y;
        }
        return x - 1;
    }

}
