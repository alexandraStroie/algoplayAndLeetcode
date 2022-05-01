package interviewBit;

//https://www.interviewbit.com/problems/edit-distance/?utm_source=midfunnel&utm_medium=email
/*
Given two strings A and B, find the minimum number of steps required to convert A to B. (each operation is counted as 1 step.)
Input 1:
    A = "abad"
    B = "abac"
    output 1
 */
public class EditDistance {

    public static void main(String[] args) {
        String A = "abad";
        String B = "abac";

        String A1 = "Anshuman";
        String B1 = "Antihuman";

        System.out.println(minDistance(A,B));
        System.out.println(minDistance(A1,B1));
    }

    public static int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[] memo = new int[len2 + 1];

        // initialize the memo
        for (int j = 1; j <= len2; j++) {
            // cost for converting from "" to word2.substring(j)
            memo[j] = j;
        }

        for (int i = 1; i <= len1; i++) {
            int prev = i;
            for (int j = 1; j <= len2; j++) {
                int cur = 0;
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    // if chars are equal, no cost for converting
                    cur = memo[j - 1];
                } else {
                    cur = 1 + Math.min(memo[j - 1], Math.min(memo[j], prev));
                }
                memo[j - 1] = prev;
                prev = cur;
            }
            memo[len2] = prev;
        }
        return memo[len2];
    }

}
