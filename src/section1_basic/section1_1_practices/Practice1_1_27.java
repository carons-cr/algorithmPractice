package section1_basic.section1_1_practices;

public class Practice1_1_27 {
    public static void main(String[] args) {
        int N = 5, k = 3;
        double p = 0.25;
        System.out.println(Practice1_1_27.binomial(N, k, p));
        double[][] binomialArr = new double[N + 1][k + 1];
        System.out.println(Practice1_1_27.binomial2(N, k, p, binomialArr));
    }

    private static double binomial(int N, int k, double p) {
        System.out.println(N + "\t" + k);
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        return p*binomial(N - 1, k - 1, p) + (1.0 - p)*binomial(N - 1, k, p);
    }

    private static double binomial2(int N, int k, double p, double[][] arr) {
        System.out.println(N + "\t" + k);
        if (N == 0 && k == 0) {
            arr[N][k] = 1.0;
        } else if (N == 0) {
            arr[N][k] = 0.0;
        } else if (k == 0) {
            arr[N - 1][k] += arr[N - 1][k] == 0.0 ? binomial2(N - 1, k, p, arr) : 0.0;
            arr[N][k] = (1 - p) * binomial2(N - 1, k, p, arr);
        } else {
            arr[N - 1][k] += arr[N - 1][k] == 0.0 ? binomial2(N - 1, k, p, arr) : 0.0;
            arr[N - 1][k - 1] += arr[N - 1][k - 1] == 0.0 ? binomial2(N - 1, k - 1, p, arr) : 0.0;
            arr[N][k] = p * arr[N - 1][k - 1] + (1 - p) * arr[N - 1][k];
        }
        return arr[N][k];
    }
}
