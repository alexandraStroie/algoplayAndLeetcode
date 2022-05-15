package hackernoon.arrays;

import java.util.Arrays;

//https://hackernoon.com/50-data-structure-and-algorithms-interview-questions-for-programmers-b4b1ac61f5b0
/*
How do you find the missing number in a given integer array of 1 to 100?

sum for n elements: 1+2+....+N = (N(N+1))/2
 */
public class MissingNrInAGivenArray {

    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 5, 6 };

        System.out.println(findMissingNumber(a));
    }

    public static int findMissingNumber(int[] arr) {
        // missingNr = sumCompleteArr - sumArr;

//        int max = arr[arr.length - 1];
//        int min = arr[0];
//        int sum = Arrays.stream(arr).sum();
//        int actual = (((max*(max+1))/2)-min+1);
//        int rez = actual - sum;
//        return rez;

        int numberOfTotalElementInArray = arr.length + 1;
        int sumOfNrsInArrayWithMissingNr = (numberOfTotalElementInArray
                * (numberOfTotalElementInArray+1)) / 2;

        int sumOfElementsInArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfElementsInArr += arr[i];
        }

        int missingNr = sumOfNrsInArrayWithMissingNr - sumOfElementsInArr;
        return missingNr;
    }
}
