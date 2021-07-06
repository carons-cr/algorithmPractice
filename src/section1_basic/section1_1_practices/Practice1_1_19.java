package algorithmPractice.src.section1_basic.section1_1_practices;

public class Practice1_1_19 {
    public static void main(String[] args) {
//        for (int N = 0; N < 100; N++) {
//            System.out.println(N + " " + F(N));
//        }
        long[] Array = new long[100];
        for (int N = 0; N < 100; N++) {
            System.out.println(N + " " + F2(N, Array));
        }
    }

    private static long F(int N) {//max = F(54) = 86267571272(so slowly,just test 54)
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    private static long F2(int N, long[] Array) {//max = F(92) = 7540113804746346429;(F(93) = -6246583658587674878)
        if (N == 0){
            Array[N] = 0;
        }else if (N == 1 || N == 2){
            Array[N] = 1;
        }else{
            if (Array[N - 1] != 0 &&Array[N - 2] != 0 ) {
                Array[N] = Array[N - 1] + Array[N - 2];
            }else if (Array[N - 1] != 0) {
                Array[N] = Array[N - 1] + F2(N - 2, Array);
            }else if (Array[N - 2] != 0) {
                Array[N] = F2(N - 1, Array) + Array[N - 2];
            }
        }
        return Array[N];
    }
}
