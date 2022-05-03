
/*
arr = [20, 19, 100, 101] -array dat; de calculat suma
digiturilor ex: 20 = 2+0 = 2; 19 = 1+9 =10

 */
public class SumDigit {
    public static void main(String[] args) {
        int[] nums = {20,19,100,101};
        System.out.println(maxSumDigit(nums));
    }

    public static int maxSumDigit(int[] nums) {
        int maxSum = 0;

        for(int i = 0; i <= nums.length-1; i++) {
            maxSum = Math.max(maxSum, sumDigit(nums[i]));
        }
        return maxSum;
    }

    public static int sumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum = n % 10 + sum;
            n /= 10;
        }

        return sum;
    }
}
