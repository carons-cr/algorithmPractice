package section1_basic.section1_1_practices;

import java.util.Arrays;

public class Practice1_1_30 {

    public static void main(String[] args) {
        int N = 4;
        boolean[][] booleans = createBooleanArrayNN(N);
        for (boolean[] row : booleans) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println(isCoprime2(9,6));
    }

    private static boolean[][] createBooleanArrayNN (int N) {
        boolean[][] booleans = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                booleans[i][j] = isCoprime(i, j);
            }
        }
        return booleans;
    }

    private static boolean isCoprime(int num1, int num2) {
        int dividend = num1 >= num2 ? num1 : num2;
        int divisor = num1 >= num2 ? num2 : num1;
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

    //判断互质还有种简单方法
    private static boolean isCoprime2(int num1, int num2) {
        int largerNum = num1 >= num2 ? num1 : num2;
        for (int i = 2; i <= Math.sqrt(largerNum); i++) {
            if (num1%i == 0 && num2%i == 0) {
                return false;
            }
        }
        return true;
    }
}
