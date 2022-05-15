package hackernoon.arrays;

import java.util.Arrays;

/*
9.How do you reverse an array in place in Java?

https://hackernoon.com/50-data-structure-and-algorithms-interview-questions-for-programmers-b4b1ac61f5b0
 */
public class ReverseAnArrayInPlace {

    public static void main(String[] args) {
        reverseArray(new int[]{101, 102, 103, 104, 105});
        reverseArrayInPlace(new int[]{101, 102, 103, 104, 105});
    }

    public static void reverseArray(int[] arr) {

        int[] reverseArr = new int[arr.length];


        int idx = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            reverseArr[idx] = arr[i];
            idx++;
        }

        System.out.println(Arrays.toString(reverseArr));
    }


    public static void reverseArrayInPlace(int[] arr) {
        int temp = 0;

        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

}
