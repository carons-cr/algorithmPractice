package algorithmPractice.src.section1_basic.section1_1_examples;

/**
 * P13
 */
public class Example1_1_3 {
    public static void main(String[] args) {
        int number2 = 23;
        if(Example1_1_3.isPrimeNumber(number2)) {
            System.out.println(number2 + "是素数");
        }else {
            System.out.println(number2 + "不是素数");
        }
    }

    /**
     * 判断是否是素数
     * @param number 需要判断的数字
     * @return { boolean }
     */
    private static boolean isPrimeNumber(int number) {
        if(number < 2) {
            return false;
        }else {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
