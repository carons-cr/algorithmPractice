package algorithmPractice.src.section1_basic.section1_1_practices;

public class Practice1_1_29 {
    public static void main(String[] args) {
        int key = 8;
        int[] orderedArray = {1, 1, 2, 4, 5, 6, 6, 6, 7, 9, 9, 9, 9, 9, 9, 10, 15, 18, 20};
        System.out.println(Practice1_1_29.lowerCount(key, orderedArray));
        System.out.println(Practice1_1_29.equalCount(key, orderedArray));
    }

    private static int lowerCount(int key, int[] orderedArray) {
        int low = 0;
        int high = orderedArray.length - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (orderedArray[mid] < key) {
                low = mid + 1;
            }else if (orderedArray[mid] > key) {
                high = mid - 1;
            }else {
                while (mid > 0 && orderedArray[mid - 1] == orderedArray[mid]) {
                    mid--;
                }
                return mid;
            }
        }
        return low;
    }

    private static int equalCount(int key, int[] orderedArray) {
        int low = 0;
        int high = orderedArray.length - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (orderedArray[mid] < key) {
                low = mid + 1;
            }else if (orderedArray[mid] > key) {
                high = mid - 1;
            }else {
                int left = mid;
                int right = mid;
                int equalCount = 1;
                while (left > 0 && orderedArray[left - 1] == orderedArray[left]) {
                    left--;
                }
                while (right < (orderedArray.length - 1) && orderedArray[right + 1] == orderedArray[right]) {
                    right++;
                }
                equalCount += right - left;
                return equalCount;
            }
        }
        return 0;
    }
}

