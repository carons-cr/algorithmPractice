package section1_basic.section1_1_examples;

public class Example1_1_1 {
    public static void main(String[] args) {
        double[] discreteArr = {0.1, 0.4, 0.2, 0.3};
        System.out.println(Example1_1_1.discrete(discreteArr));
    }

    private static int discrete(double[] discreteArr) {
        double random = Math.random();
        double sum = 0.0;
        for (int i = 0; i < discreteArr.length; i++) {
            sum += discreteArr[i];
            if (sum >= random) {
                return i;
            }
        }
        return -1;
    }
}
