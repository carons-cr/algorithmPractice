package algorithmPractice.src.section1_basic.section1_1_examples;

/**
 * P13
 */
public class Example1_1_4 {
    public static void main(String[] args) {
        int number = 121;
        System.out.println(number + "的平方根是" + Example1_1_4.sqrt(number));
    }

    /**
     * 牛顿迭代法求平方根
     * @param number
     * @return
     */
    private static double sqrt(double number) {
        double e = 1e-15;
        double squareRoot = number;
        if (number < 0) {
            return Double.NaN;
        }
        // |x^2 - number|的误差在1*10^-15内则求得平方根
        while (Math.abs(squareRoot*squareRoot-number) > e) {
            // 牛顿迭代法的迭代公式，x(n+1) = (xn + number/xn)/2.0
            squareRoot = (squareRoot + number/squareRoot)/2.0;
        }
        return squareRoot;
    }
}
