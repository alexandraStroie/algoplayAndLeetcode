package hackernoon;

import java.util.HashMap;

/*
 find the char that has the most appearances in a string
 */
public class FindTheCharWithMostAppearancesInAString {
    public static void main(String[] args) {
        String str1 = "aaabbcdaaaddqqeej";
        String str2 = "eexxffaaarr";

        System.out.println(countAppearances(str1));
        System.out.println(countAppearances(str2));
    }

    public static String countAppearances(String str) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        
        for (int i = 0; i < str.length(); i++) {
            if (!hashMap.containsKey(str.charAt(i))) {
                hashMap.put(str.charAt(i), 1);
            } else {
                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
            }
        }
        
        int cntMax = 0;
        char x = 0;
        for (Character key : hashMap.keySet()) {
            if (hashMap.get(key) > cntMax) {
                cntMax = hashMap.get(key);
                x = key;
            }
        }
        
        String result = "Char " + x + " appears " + cntMax + " times";
        return result;
    }
}
