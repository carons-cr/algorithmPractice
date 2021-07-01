package algorithmPractice.src.section1_basic.section1_1_examples;

/**
 * P5
 */
public class Example1_1_5 {
    public static void main(String[] args) {
        int key = 5;
        int[] sequenceArray = {1, 2, 3, 4, 5, 6};
        int keyPosition = Example1_1_5.binarySearch(key, sequenceArray);
        System.out.println(keyPosition == -1 ? "关键字不在该数组中" : "关键字在数组的第" + keyPosition + "位");
    }

    /**
     * 二分查找
     * @param key 要查找的值
     * @param sequenceArray 有序数组
     * @return { int } 返回要查找的值在有序数组中的索引值，若没找到就返回-1
     */
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
