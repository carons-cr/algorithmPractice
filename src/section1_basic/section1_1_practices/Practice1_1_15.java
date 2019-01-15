package section1_basic.section1_1_practices;

import java.util.Arrays;

public class Practice1_1_15 {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 0};
        int M = 3;
        System.out.println(Arrays.toString(Practice1_1_15.histogram(a, M)));
    }

    private static int[] histogram(int[] a, int M) {
        int[] result = new int[M];
        for (int i = 0; i < result.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
