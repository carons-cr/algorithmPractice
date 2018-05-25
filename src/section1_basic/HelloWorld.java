package section1_basic;

public class HelloWorld {

    public static void main(String args[]) {
        HelloWorld helloWorld = new HelloWorld();

        double[] discreteArr = {0.1, 0.4, 0.2, 0.3};
        System.out.println(helloWorld.discrete(discreteArr));

        int key2 = 2;
        int[] sequenceArray2 = {1, 2, 3};
        int keyPosition2 = helloWorld.binarySearch2(key2, sequenceArray2);
        System.out.println(keyPosition2 == -1 ? "关键字不在该数组中" : "关键字在数组的第" + (keyPosition2 + 1) + "位");

        int number2 = 23;
        if(helloWorld.isPrimeNumber(number2)) {
            System.out.println(number2 + "是素数");
        }else {
            System.out.println(number2 + "不是素数");
        }

        int number = 225;
        System.out.println(number + "的平方根是" + helloWorld.sqrt(number));

        int key = 5;
        int[] sequenceArray = {1, 2, 3, 4, 5, 6};
        int keyPosition = helloWorld.binarySearch(key, sequenceArray);
        System.out.println(keyPosition == -1 ? "关键字不在该数组中" : "关键字在数组的第" + keyPosition + "位");

        System.out.println(helloWorld.greatestCommonDivisor(8,5));
    }

    private int greatestCommonDivisor(int divisor, int dividend) {
        if (dividend == 0) {
            return divisor;
        }else {
            int remainder = divisor % dividend;
            return greatestCommonDivisor(dividend, remainder);
        }
    }

    private int binarySearch(int key, int[] sequenceArray) {
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

    private double sqrt(double number) {
        double err = 1e-15;
        double squareRoot = number;
        if (number < 0) {
            return Double.NaN;
        }
        while (Math.abs(squareRoot-number/squareRoot) > err * squareRoot) {//对于为什么要乘squreRoot不懂
            squareRoot = (squareRoot + number/squareRoot)/2.0;
        }
        return squareRoot;
    }

    private boolean isPrimeNumber(int number) {
        if(number < 2) {
            return false;
        }else {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    private int binarySearch2(int key, int[] sequenceArray) {
        return binarySearch2(key, sequenceArray, 0, sequenceArray.length - 1);
    }

    private int binarySearch2(int key, int[] sequenceArray, int startIndex, int endIndex) {
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

    private int discrete(double[] discreteArr) {
        double random = Math.random();
        double sum = 0.0;
        for (int i = 0; i < discreteArr.length; i++) {
            sum += discreteArr[i];
            if (sum >= random) {
                return i;
            }
        }
        return -1;
    }


}
