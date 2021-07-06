package algorithmPractice.src.section1_basic.section1_1_practices;

public class Practice1_1_22 {
    public static void main(String[] args) {
        Practice1_1_22.binarySearch(3, new int[]{1, 2, 3, 6, 7, 9, 10});
    }

    private static int binarySearch(int key, int[] arr) {
        return binarySearch(key, arr, 0, arr.length - 1, 0);
    }

    private static int binarySearch(int key, int[] arr, int low, int high, int depth) {
        Practice1_1_22.indentPrint(low, high, depth);
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

    private static void indentPrint(int low, int high, int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("\t");
        }
        System.out.println(indent.toString() + "(" + low + ", " + high + ")");
    }
}
