package section1_basic.section1_1_practices;

public class Practice1_1_20 {
    public static void main(String[] args) {
        System.out.println(Practice1_1_20.lnFactorial(4));
        System.out.println(Math.log(24));
    }

    private static double lnFactorial(int N) {//4=3.1780538303479458
        return Math.log(factorial(N));
    }

    private static long factorial(int N) {//4=24
        if (N == 0 || N == 1) {
            return 1;
        }
        return N*factorial(N - 1);
    }
}
