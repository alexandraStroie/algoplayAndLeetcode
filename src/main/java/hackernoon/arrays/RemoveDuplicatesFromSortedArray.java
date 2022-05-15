package hackernoon.arrays;

/*

How are duplicates removed from a given array in Java?
sorted array
https://javarevisited.blogspot.com/2014/01/how-to-remove-duplicates-from-array-java-without-collection-API.html?source=post_page---------------------------&ref=hackernoon.com

Output :
Array with Duplicates       : [1, 1, 2, 2, 3, 4, 5]
After removing duplicates   : [1, 0, 2, 0, 3, 4, 5]
Array with Duplicates       : [1, 1, 1, 1, 1, 1, 1]
After removing duplicates   : [1, 0, 0, 0, 0, 0, 0]
Array with Duplicates       : [1, 2, 3, 4, 5, 6, 7]
After removing duplicates   : [1, 2, 3, 4, 5, 6, 7]
Array with Duplicates       : [1, 2, 1, 1, 1, 1, 1]
After removing duplicates   : [1, 0, 0, 0, 0, 0, 2]

 */

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

        removeDuplicatesFromArray(new int[]{1, 1, 2, 2, 3, 4, 5});
        removeDuplicatesFromArray(new int[]{1, 1, 1, 1, 1, 1, 1});
    }


    public static void removeDuplicatesFromArray(int[] arr){

        Arrays.sort(arr);

        int[] result = new int[arr.length];
        int previous = arr[0];
        result[0] = previous;

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];

            if (previous != current) {
                result[i] = current;
            }
            previous = current;
        }

        System.out.println(Arrays.toString(result));;
    }
}
