package leetcode;

public class RemoveDuplicatesFromSortedArray26 {
    public static void main(String[] args) {

    }


    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        int idx = 1;
        for(int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }
}
