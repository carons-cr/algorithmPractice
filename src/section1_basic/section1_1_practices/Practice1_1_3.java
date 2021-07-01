package algorithmPractice.src.section1_basic.section1_1_practices;

import java.util.Scanner;

public class Practice1_1_3 {
    public static void main(String[] args) {
        Practice1_1_3.exercise1_1_3();
    }

    private static void exercise1_1_3() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 == num2 && num2 == num3) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
