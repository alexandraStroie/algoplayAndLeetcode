package leetcode;

//https://leetcode.com/problems/repeated-substring-pattern/

public class RepeatedSubstringPattern459 {

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern( "abab"));
        System.out.println(repeatedSubstringPattern( "aba"));
        System.out.println(repeatedSubstringPattern( "abcabcabcabc"));
    }

    public static boolean repeatedSubstringPattern(String s) {

        for (int i = 0; i < s.length()-2; i++) {
            System.out.println(s.substring(i,i+2));
            if (s.substring(i+2).contains(s.substring(i,i+2))) {
                return true;
            }
        }

        return false;
    }

}
