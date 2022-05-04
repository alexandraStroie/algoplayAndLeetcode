package hackernoon;

/*
https://hackernoon.com/50-data-structure-and-algorithms-interview-questions-for-programmers-b4b1ac61f5b0

https://javarevisited.blogspot.com/2014/01/how-to-remove-duplicates-from-array-java-without-collection-API.html?source=post_page---------------------------&ref=hackernoon.com#axzz7SCrmfRSN

How do you find the duplicate number on a given integer array?
 */

import java.util.Arrays;

public class MinMaxInUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {-20, 34, 21, -87, 92, 2147483647};
        int[] arr2 = {2147483647, 40, 2147483647};
        System.out.println(Arrays.toString(minMaxUnsortedArr(arr)));
        System.out.println(Arrays.toString(minMaxUnsortedArr(arr2)));
    }

    public static int[] minMaxUnsortedArr(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] result = new int[2];
        result[0] = min;
        result[1] = max;

        return result;
    }
}
