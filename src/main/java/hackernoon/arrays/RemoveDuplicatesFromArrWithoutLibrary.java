package hackernoon.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromArrWithoutLibrary {
    public static void main(String[] args) {
        removeDuplicatesWithHashSet(new int[]{1, 1, 2, 2, 3, 4, 5});
        removeDuplicatesInPlace(new int[]{1, 1, 2, 2, 3, 4, 5});
    }

    public static void removeDuplicatesWithHashSet(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        int[] result = new int[arr.length];

        for (int n : arr) {
            hashSet.add(n);
        }

        int idx = 0;
        for (int n: hashSet) {
            result[idx] = n;
            idx++;
        }

        System.out.println(Arrays.toString(result));
    }


    public static void removeDuplicatesInPlace(int[] arr) {
        int[] result = new int[arr.length];

        Arrays.sort(arr);
        int prev = arr[0];
        result[0] = prev;

        for(int i = 1; i < arr.length; i++) {
            int current = arr[i];

            if (prev != current) {
                result[i] = current;
                prev = current;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
