package section1_basic.section1_1_examples;

public class Example1_1_6 {
    public static void main(String[] args) {
        System.out.println(Example1_1_6.greatestCommonDivisor(8,5));
    }

    private static int greatestCommonDivisor(int divisor, int dividend) {
        if (dividend == 0) {
            return divisor;
        }else {
            int remainder = divisor % dividend;
            return greatestCommonDivisor(dividend, remainder);
        }
    }
}
