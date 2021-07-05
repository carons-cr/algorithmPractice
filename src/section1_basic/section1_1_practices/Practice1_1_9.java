package algorithmPractice.src.section1_basic.section1_1_practices;

public class Practice1_1_9 {
    public static void main(String[] args) {
        Practice1_1_9.exercise1_1_9(9);
        Integer.toBinaryString ( 9 );
    }

    private static void exercise1_1_9(int Number) {
        StringBuilder stringBuilder = new StringBuilder ( );
        for (int i = Number; i > 0; i /= 2) {
            stringBuilder.append ( i%2 );
        }
        System.out.println(stringBuilder.toString ());//1001
    }
}
