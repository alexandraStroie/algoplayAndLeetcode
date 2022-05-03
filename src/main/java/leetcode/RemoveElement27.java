package leetcode;

/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
 */
public class RemoveElement27 {
    public static void main(String[] args) {
        int[] nums;
        System.out.println(removeElement(new int[]{3, 2, 2, 3},3));
    }

    public static int removeElement(int[] nums, int val) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        return idx;
    }
}
