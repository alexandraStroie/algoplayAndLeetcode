import java.util.HashMap;
import java.util.HashSet;

/*
•	Find duplicates in array of integers and sum them. Example: [1,2,2,3,4,4,4,5] =>
print duplicated numbers are 2 and 4 => sum is 6
•	Think about edge cases, and all kinds of inputs
•	Program should prompt the user for input, do the magic and print out the result
•	Would be great to have understandable  printout
•	Write a readme file how to run the program

 */
public class AdiInterview {
    public static void main(String[] args) {

        int[] nums = {1,2,2,3,4,4,4,5};
        System.out.println(sumOfDuplicates(nums));
    }

    public static int sumOfDuplicates(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int sum = 0;

        for (int n : nums) {
            if (hashMap.containsKey(n)) {
                hashMap.put(n, hashMap.get(n) + 1);
            } else {
                hashMap.put(n,1);
            }
        }

        for (int key : hashMap.keySet()) {
            if (hashMap.get(key) > 1) {
                sum = sum + key;
            }
        }

        return sum;
    }
}
