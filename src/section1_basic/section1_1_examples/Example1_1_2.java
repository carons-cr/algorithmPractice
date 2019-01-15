package section1_basic.section1_1_examples;

public class Example1_1_2 {
    public static void main(String[] args) {
        int key2 = 2;
        int[] sequenceArray2 = {1, 2, 3};
        int keyPosition2 = Example1_1_2.binarySearch2(key2, sequenceArray2);
        System.out.println(keyPosition2 == -1 ? "关键字不在该数组中" : "关键字在数组的第" + (keyPosition2 + 1) + "位");
    }

    private static int binarySearch2(int key, int[] sequenceArray) {
        return Example1_1_2.binarySearch2(key, sequenceArray, 0, sequenceArray.length - 1);
    }

    private static int binarySearch2(int key, int[] sequenceArray, int startIndex, int endIndex) {
        if(startIndex > endIndex) {
            return -1;
        }
        int midIndex = startIndex + (endIndex - startIndex) / 2;
        if (key < sequenceArray[midIndex]) {
            return binarySearch2(key, sequenceArray, startIndex, midIndex - 1);
        } else if (key > sequenceArray[midIndex]) {
            return binarySearch2(key, sequenceArray, midIndex + 1, endIndex);
        } else {
            return midIndex;
        }
    }
}
