package section1_basic.section1_1_examples;

public class Example1_1_4 {
    public static void main(String[] args) {
        int number = 225;
        System.out.println(number + "的平方根是" + Example1_1_4.sqrt(number));
    }

    private static double sqrt(double number) {
        double err = 1e-15;
        double squareRoot = number;
        if (number < 0) {
            return Double.NaN;
        }
        while (Math.abs(squareRoot-number/squareRoot) > err * squareRoot) {//对于为什么要乘squreRoot不懂
            squareRoot = (squareRoot + number/squareRoot)/2.0;
        }
        return squareRoot;
    }
}
