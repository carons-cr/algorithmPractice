package algorithmPractice.src.section1_basic.section1_1_examples;

/**
 * P19
 */
public class Example1_1_1 {
    public static void main(String[] args) {
         /*random在[0, 1)，则遍历到数组某处必有sum>=random，以下面数组为例:
            i = 0, sum = 0.1, 当random <= 0.1时返回0;
            i = 1, sum = 0.5, 当0.1 < random <= 0.5时返回1;
            i = 2, sum = 0.7, 当0.5 < random <= 0.7时返回2;
            i = 3, sum = 1, 当0.7 < random <= 1时返回3;
            即p{i = 0} = 0.1; p{i = 1} = 0.5 - 0.1 = 0.4; p{i = 0} = 0.7 - 0.5 = 0.2; p{i = 0} = 1 - 0.7 = 0.3;*/
        double[] discreteArr = {0.1, 0.4, 0.2, 0.3};
        System.out.println(Example1_1_1.discrete(discreteArr));
    }

    /**
     * 根据离散概率随机返回的int值(出现i的概率为a[i])
     * @param discreteArr 数组a
     * @return { int } i
     */
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
