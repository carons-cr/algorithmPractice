package section1_basic.section1_1_practices;

public class Practice1_1_5 {
    public static void main(String[] args) {
        Practice1_1_5.exercise1_1_5();
    }

    private static void exercise1_1_5() {  //true
        double x = 0.9;
        double y = 0.5;
        if (x >0 && x <1 && y > 0 && y < 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
