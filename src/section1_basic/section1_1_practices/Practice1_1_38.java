package algorithmPractice.src.section1_basic.section1_1_practices;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice1_1_38 {
    public static void main(String[] args) {
        int[] array = { 1, 6, 3, 10, 2, 9, 4 };
        int key = 2;

        long startTime = System.currentTimeMillis ();
        int resultIndex = bruteForceSearch ( key, array );
        long endTime = System.currentTimeMillis ();
        long spendTime = endTime - startTime;
        System.out.println ("暴力查找结果：" + resultIndex + "，用时: " +  spendTime + " ms");
        startTime = System.currentTimeMillis ();
        Arrays.sort ( array);
        resultIndex = binarySearch ( key, array );
        endTime = System.currentTimeMillis ();
        spendTime = endTime - startTime;
        System.out.println ("二分查找结果：" + resultIndex + "，用时: " +  spendTime + " ms");
    }

    /**
     * 暴力查找
     * @param key 要查找的值
     * @param array 数组
     * @return { int } 关键值在数组中的索引，若不在数组中返回-1
     */
    public static int bruteForceSearch(int key, int[] array) {
        for ( int i = 0 ; i < array.length ; i++ ) {
            if ( array[i] == key ) return i;
        }
        return -1;
    }

    /**
     * 二分查找法
     * @param key 要查找的值
     * @param sortedArray 排序后的数组
     * @return { int } 关键值在数组中的索引，若不在数组中返回-1
     */
    public static int binarySearch(int key, int[] sortedArray) {
        int start = 0;
        int end = sortedArray.length - 1;
        while ( start <= end ) {
            int mid = start + (end - start)/2;
            if ( key < sortedArray[mid] ) {
                end = mid - 1;
            }else if(key > sortedArray[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}

