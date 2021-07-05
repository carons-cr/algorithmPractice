package algorithmPractice.src.section1_basic.section1_1_practices;

public class Practice1_1_18 {
    public static void main(String[] args) {
        System.out.println(Practice1_1_18.mystery(2, 25));
        System.out.println(Practice1_1_18.mystery(3, 11));

        System.out.println(Practice1_1_18.mystery2(2, 25));
        System.out.println(Practice1_1_18.mystery2(3, 11));
    }

    private static int mystery(int a, int b) {//2,25=0+32+16+2=50;3,11=0+24+6+3=33
        if (b == 0) {
            return 0;
        }
        if (b%2 == 0) {
            return mystery(a + a, b/2);
        }
        return mystery(a + a, b/2) + a;
    }

    private static int mystery2(int a, int b) {//2,25=2^16*2^8*2*1=2^25=33554432; 3,11=3^8*2^2*3*1=3^11=177147
        if (b == 0) {
            return 1;
        }
        if (b%2 == 0) {
            return mystery2(a * a, b/2);
        }
        return mystery2(a * a, b/2) * a;
    }
}
