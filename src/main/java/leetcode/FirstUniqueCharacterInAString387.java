package leetcode;

import java.util.HashMap;
import java.util.Map;

/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Input: s = "leetcode"
Output: 0

Input: s = "loveleetcode"
Output: 2

Input: s = "aabb"
Output: -1
 */
public class FirstUniqueCharacterInAString387 {
    public static void main(String[] args) {

        String input = "loveleetcode";
        System.out.println(firstUniqChar(input));
        System.out.println(firstUniqCharHashMap(input));
        System.out.println(firstUniqCharStringIndex(input));

    }

    public static int firstUniqCharHashMap(String s) {
        HashMap<Character, Integer> hashmap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            hashmap.put(ch, hashmap.getOrDefault(ch,0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (hashmap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqCharStringIndex(String s) {

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }

        return -1;
    }



    public static int firstUniqChar(String s) {
        int[] count = new int[26];
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            count[index]++;
        }

        for (int i = 0; i < count.length; i++) {
            int index = s.charAt(i) - 'a';
            if (count[index] == 1) {
                return i;
            }
        }

        return -1;
    }
}


























