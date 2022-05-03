package leetcode;
/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 https://leetcode.com/problems/implement-strstr/discuss/1992250/100-Brute-Force-and-KMP-Explained

 https://www.geeksforgeeks.org/kmp-algorithm-for-pattern-searching/
 */

import java.util.Objects;

public class ImplementStr28 {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";

        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle){
        if (Objects.equals(haystack, "")) {
            return -1;
        }

        if (needle.equals("")) {
            return 0;
        }

        if (haystack.contains(needle)) {

            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    if (haystack.substring(i, i + needle.length()).equals(needle) ) {
                        return i;
                    }
                }
            }
        }

        return -1;

    }
}
