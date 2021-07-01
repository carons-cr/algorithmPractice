package algorithmPractice.src.section1_basic.section1_1_examples;

/**
 * P1
 */
public class Example1_1_6 {
    public static void main(String[] args) {
        System.out.println(Example1_1_6.greatestCommonDivisor(8,4));
    }

    /**
     * 欧几里得算法求最大公约数
     * @param divisor 被除数
     * @param dividend 除数
     * @return { int } 最大公约数
     */
    private static int greatestCommonDivisor(int dividend, int divisor) {
        if (divisor == 0) {
            return dividend;
        }else {
            int remainder = dividend % divisor;
            return greatestCommonDivisor(divisor, remainder);
        }
    }
}
