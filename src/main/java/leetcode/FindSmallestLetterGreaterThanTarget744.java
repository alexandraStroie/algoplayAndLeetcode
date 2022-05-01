package leetcode;
/*
Given a characters array letters that is sorted in non-decreasing order and a
character target, return the smallest character in the array that is larger than target.

Note that the letters wrap around.
For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.

Input: letters = ["c","f","j"], target = "a"
Output: "c"

Input: letters = ["c","f","j"], target = "c"
Output: "f"

Input: letters = ["c","f","j"], target = "d"
Output: "f"

Input: letters = ["c","f","j"], target = "g"
Output: "j"

2 <= letters.length <= 104
letters[i] is a lowercase English letter.
letters is sorted in non-decreasing order.
letters contains at least two different characters.
target is a lowercase English letter.
 */
public class FindSmallestLetterGreaterThanTarget744 {

    public static void main(String[] args) {

        char[] letters = {'c','f','j'};
        char target = 'a';

        char[] letters2 = {'c','f','j'};
        char target2 = 'a';


        System.out.println(nextGreatestLetter(letters,'a'));  // ->c
        System.out.println(nextGreatestLetter(letters,'c'));  //->f
        System.out.println(nextGreatestLetter(letters,'d'));   //-> f
        System.out.println(nextGreatestLetter(letters,'g'));  //-> j
        System.out.println(nextGreatestLetter(letters,'j'));  // -> c
    }


    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        int mid;
        char result = letters[left];

        while (left <= right) {

            mid = left + (right - left) / 2;

            if (letters[mid] > target) {
                right = mid - 1;
                result = letters[mid];
            } else {
                left = mid + 1;
            }

        }
        return result;
    }


}
