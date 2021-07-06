package algorithmPractice.src.section1_basic.section1_1_practices;

import java.util.Scanner;

public class Practice1_1_23 {
    public static void main(String[] args) {
        Practice1_1_23.binarySearchTest();
    }

    private static void indentPrint(int low, int high, int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("\t");
        }
        System.out.println(indent.toString() + "(" + low + ", " + high + ")");
    }

    private static int binarySearch(int key, int[] arr) {
        return binarySearch(key, arr, 0, arr.length - 1, 0);
    }

    private static int binarySearch(int key, int[] arr, int low, int high, int depth) {
        Practice1_1_23.indentPrint(low, high, depth);
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low)/2;
        if (key < arr[mid]) {
            return binarySearch(key, arr, low, mid - 1, depth + 1);
        }else if (key > arr[mid]) {
            return binarySearch(key, arr, mid + 1, high, depth + 1);
        }else {
            return mid;
        }
    }

    private static void binarySearchTest() {//1,2,3 + 1 4, print 4; //1,2,3 - 1 4, print 1
        Scanner scanner = new Scanner(System.in);
        String[] whiteListStr = scanner.next().split(",");
        int[] whiteList = new int[whiteListStr.length];
        for (int i = 0; i < whiteListStr.length; i++) {
            whiteList[i] = Integer.parseInt(whiteListStr[i]);//获取到整型白名单数组
        }
        String signal = scanner.next();//获取符号+/-,用来判断输出

        while(scanner.hasNext()) {
            int key = scanner.nextInt();
            if (signal.equals("+") && binarySearch(key, whiteList) == -1) {
                System.out.println(key);
            }else if (signal.equals("-") && binarySearch(key, whiteList) != -1) {
                System.out.println(key);
            }
        }
    }
}
