package algorithmPractice.src.section1_basic.section1_1_practices;

public class Practice1_1_5 {
    public static void main(String[] args) {
        Practice1_1_5.exercise1_1_5(0.9, 0.00005);
    }

    private static void exercise1_1_5(double x , double y) {  //true
        System.out.println( x > 0 && x < 1 && y > 0 && y < 1 );
    }
}
