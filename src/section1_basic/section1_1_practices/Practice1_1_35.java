package algorithmPractice.src.section1_basic.section1_1_practices;

import java.util.Random;

public class Practice1_1_35 {
    static int SIDES = 6;
    static double[] dist = new double[2*SIDES + 1];

    public static void main(String[] args) {
        Practice1_1_35.calculateDist();
        Practice1_1_35.printDist(dist);
        for (int N = 1000000; N < 10000000; N += 100000) {
            double[] actualDist = Practice1_1_35.simulataDist(N);
            for (int i = 0; i < dist.length; i++) {
                if (Math.abs(actualDist[i] - dist[i]) >= 1e-4) {
                    break;
                }
                if (i == dist.length - 1) {
                    System.out.println("N为" + N + "时经验数据和准确数据吻合程度达到小数点后三位");
                    Practice1_1_35.printDist(actualDist);
                    return;
                }
            }
        }
    }

    private static void calculateDist() {
        for (int i = 1; i <= Practice1_1_35.SIDES; i++) {
            for (int j = 1; j <= Practice1_1_35.SIDES; j++) {
                dist[i + j] += 1.0;
            }
        }
        for (int i = 0; i < dist.length; i++) {
            dist[i] /= Practice1_1_35.SIDES*Practice1_1_35.SIDES;
        }
    }

    private static void printDist(double[] dist) {
        for (int i = 0; i < dist.length; i++) {
            System.out.println("两数之和为" + i + "的概率是" + dist[i]);
        }
    }

    private static double[] simulataDist(int N) {
        double[] actualDist = new double[Practice1_1_35.SIDES*2 + 1];
        Random random = new Random();
        for (int k = 0; k < N; k++) {
            int i = random.nextInt(6) + 1;
            int j = random.nextInt(6) + 1;
            actualDist[i + j] += 1.0;
        }
        for (int i = 0; i < actualDist.length; i++) {
            actualDist[i] /= N;
        }
        return actualDist;
    }
}
