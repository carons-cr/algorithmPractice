package section1_basic.section1_1_practices;

import java.util.Scanner;

public class Practice1_1_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(Practice1_1_24.Euclid(num1, num2, 0));
    }

    private static void indentPrint(int low, int high, int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("\t");
        }
        System.out.println(indent.toString() + "(" + low + ", " + high + ")");
    }

    private static int Euclid(int dividend, int divisor, int depth) {
        indentPrint(dividend, divisor, depth);
        if (divisor == 0) {
            return dividend;
        }
        int remainder = dividend % divisor;
        return Euclid(divisor, remainder, depth + 1);
    }
}
