package section1_basic.section1_1_practices;

import java.util.Arrays;

public class Practice1_1_28 {
    public static void main(String[] args){
        int[] whiteList = new int[]{1,4,7,2,3,6,4,5,1,3,10};
        Arrays.sort(whiteList);
        Practice1_1_28.removeRepetition(whiteList);
    }

    private static void removeRepetition(int[] whiteList) {
        int nonRepeatedCount = getNonRepeatedCount(whiteList);
        int[] nonRepeatedList = new int[nonRepeatedCount];
        nonRepeatedList[0] = whiteList[0];
        int repeatNumber = nonRepeatedList[0];
        int nonRepeatedListIndex = 1;
        for (int i = 1; i < whiteList.length; i++) {
            if (whiteList[i] != repeatNumber) {
                nonRepeatedList[nonRepeatedListIndex] = whiteList[i];
                repeatNumber = nonRepeatedList[nonRepeatedListIndex];
                nonRepeatedListIndex++;
            }
        }
        System.out.println(Arrays.toString(nonRepeatedList));
    }
    private static int getNonRepeatedCount(int[] whiteList) {
        int repeatNumber = whiteList[0];
        int nonRepeatedCount = 1;
        for (int i = 1; i < whiteList.length; i++) {
            if (whiteList[i] != repeatNumber) {
                nonRepeatedCount++;
                repeatNumber = whiteList[i];
            }
        }
        return nonRepeatedCount;
    }
}
