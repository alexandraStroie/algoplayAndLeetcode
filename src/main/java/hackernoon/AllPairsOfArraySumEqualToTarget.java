package hackernoon;

/*
https://hackernoon.com/50-data-structure-and-algorithms-interview-questions-for-programmers-b4b1ac61f5b0
https://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html?source=post_page---------------------------&ref=hackernoon.com#axzz7SCrmfRSN

How do you find all pairs of an integer array whose sum is equal to a given number?.

input integer array is {2, 6, 3, 9, 11} and the given sum is 9, the output should be {6,3}.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class AllPairsOfArraySumEqualToTarget {

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        int target = 7;
        System.out.println(Arrays.toString(findPairs(arr, target)));
        System.out.println(Arrays.toString(findPairsWithHashSet(arr, target)));
        System.out.println(Arrays.toString(findPairsWithHashMap(arr, target)));
    }


    public static int[] findPairs(int[] arr, int targetSum) {
        int[] results = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if (targetSum - arr[j] == arr[i]) {
                    results[0] = arr[i];
                    results[1] = arr[j];
                }
            }

        }

        return results;
    }


    public static int[] findPairsWithHashSet(int[] arr, int targetSum) {
        int[] results = new int[2];
        HashSet<Integer> hashSet = new HashSet<>();
        int valTofind = 0;

        //valTofind = targetSum - valInHashSet;

        for (int val : arr) {
            valTofind = targetSum - val;

            if (!hashSet.contains(valTofind)) {
                hashSet.add(val);
            } else {
                results[0] = val;
                results[1] = valTofind;
            }
        }

        return results;
    }


    public static int[] findPairsWithHashMap(int[] arr, int targetSum) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int[] results = new int[2];
        int findVal = 0;

        for (int i = 0; i < arr.length; i++) {
            findVal = targetSum - arr[i];

            if (hashMap.containsKey(findVal)) {
                results[0] = findVal;
                results[1] = arr[i] ;
            } else {
                hashMap.put(arr[i],i);
            }
        }
        return results;
    }

}
