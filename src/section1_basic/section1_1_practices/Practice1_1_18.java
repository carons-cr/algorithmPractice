package section1_basic.section1_1_practices;

public class Practice1_1_18 {
    public static void main(String[] args) {
        System.out.println(Practice1_1_18.mystery(2, 25));
        System.out.println(Practice1_1_18.mystery(3, 11));
    }

    private static int mystery(int a, int b) {//2,25=0+32+16+2=75;3,11=0+24+6+3=33
        if (b == 0) {
            return 0;
        }
        if (b%2 == 0) {
            return mystery(a + a, b/2);
        }
        return mystery(a + a, b/2) + a;
    }
}
