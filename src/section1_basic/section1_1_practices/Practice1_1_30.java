package algorithmPractice.src.section1_basic.section1_1_practices;

import java.util.Arrays;

public class Practice1_1_30 {

    public static void main(String[] args) {
        int N = 4;
        boolean[][] booleans = createBooleanArrayNN(N);
        for (boolean[] row : booleans) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();

        boolean[][] booleans2 = createBooleanArrayNN2(N);
        for (boolean[] row : booleans2) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static boolean[][] createBooleanArrayNN (int N) {
        boolean[][] booleans = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                booleans[i][j] = isCoprime(i + 1, j + 1);
            }
        }
        return booleans;
    }

    private static boolean isCoprime(int num1, int num2) {
        int dividend = Math.max ( num1 , num2 );
        int divisor = Math.min ( num1 , num2 );
        return  (getGreatCommonDivisor(dividend, divisor) == 1);
    }

    private static int getGreatCommonDivisor(int dividend, int divisor) {
        if (divisor == 0) {
            return dividend;
        }else {
            int remainder = dividend % divisor;
            return getGreatCommonDivisor(divisor, remainder);
        }
    }

    private static boolean[][] createBooleanArrayNN2 (int N) {
        boolean[][] booleans = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                booleans[i][j] = isCoprime2(i + 1, j + 1);
            }
        }
        return booleans;
    }

    //判断互质还有种简单方法
    private static boolean isCoprime2(int num1, int num2) {
        if (num1 ==  1 || num2 == 1) return true;
        if (num1 ==  num2) return false;
        int largerNum = Math.max ( num1 , num2 );
        for (int i = 2; i <= Math.sqrt(largerNum); i++) {
            if (num1%i == 0 && num2%i == 0) {
                return false;
            }
        }
        return true;
    }
}
