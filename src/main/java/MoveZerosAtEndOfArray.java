/*
Describe (pseudocode) the algorithm for the following problem:
Given an array of random numbers, move all the zeros of a given array to the end of
the array.

Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
Output : arr[] = {1, 2, 4, 3, 5, 0, 0};

Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
Output : arr[] = {1, 2, 3, 6, 0, 0, 0};


 */

import java.util.Arrays;

public class MoveZerosAtEndOfArray {
    public static void main(String[] args) {
        int[] arr1  = {1, 2, 0, 0, 0, 3, 6};
        int[] arr  = {2,0,4,3,0,5,0};
        solution(arr);
    }

    public static void solution(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 ) {
                continue;
            }
            nums[idx] = nums[i];
            idx++;
        }

        for(int i = idx; i < nums.length; i++) {
            nums[i] = 0;
        }

        System.out.print(Arrays.toString(nums));
    }
}
