package section1_basic.section1_1_examples;

public class Example1_1_5 {
    public static void main(String[] args) {
        int key = 5;
        int[] sequenceArray = {1, 2, 3, 4, 5, 6};
        int keyPosition = Example1_1_5.binarySearch(key, sequenceArray);
        System.out.println(keyPosition == -1 ? "关键字不在该数组中" : "关键字在数组的第" + keyPosition + "位");
    }

    private static int binarySearch(int key, int[] sequenceArray) {
        int startIndex = 0;
        int endIndex = sequenceArray.length - 1;
        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex)/2;
            if (key < sequenceArray[midIndex]) {
                startIndex = midIndex -1;
            } else if (key > sequenceArray[midIndex]) {
                startIndex = midIndex + 1;
            } else {
                return midIndex;
            }
        }
        return -1;
    }
}
