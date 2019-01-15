package section1_basic.section1_1_practices;

public class Practice1_1_19 {
    public static void main(String[] args) {
        for (int N = 0; N < 45; N++) {
            System.out.println(N + " " + F(N));
        }
        long[] F2Arr = new long[100];
        for (int N = 0; N < 100; N++) {
            System.out.println(N + " " + F2(N, F2Arr));
        }
    }

    private static long F(int N) {//44=701408733(so slowly,just test 44)
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    private static long F2(int N, long[] F2Arr) {//99=-2437933049959450366
        if (N == 0){
            F2Arr[N] = 0;
        }else if (N == 1){
            F2Arr[N] = 1;
        }else{
            F2Arr[N] = F2Arr[N - 1] + F2Arr[N - 2];
        }
        return F2Arr[N];
    }
}
