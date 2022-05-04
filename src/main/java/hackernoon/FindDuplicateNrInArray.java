package hackernoon;

import java.util.Arrays;

/*
How do you find the duplicate number on a given integer array?
https://hackernoon.com/50-data-structure-and-algorithms-interview-questions-for-programmers-b4b1ac61f5b0
https://javarevisited.blogspot.com/2014/01/how-to-remove-duplicates-from-array-java-without-collection-API.html?source=post_page---------------------------&ref=hackernoon.com#axzz7SCrmfRSN

 */
public class FindDuplicateNrInArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5};
        int[] arr2 = {1, 1, 1, 1, 1, 1, 1};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr4 = {1, 2, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(removeDuplicates(arr)));
        System.out.println(Arrays.toString(removeDuplicates(arr2)));
        System.out.println(Arrays.toString(removeDuplicates(arr3)));
        System.out.println(Arrays.toString(removeDuplicates(arr4)));

    }

    public static int[] removeDuplicates(int[] arr) {
        int[] result = new int[arr.length];

        Arrays.sort(arr);
        int prev = arr[0];
        result[0] = prev;

        for (int i = 1; i < arr.length; i++) {

            if (prev != arr[i]){
                result[i] = arr[i];
            }

            prev = arr[i];
        }

        return result;
    }


}
