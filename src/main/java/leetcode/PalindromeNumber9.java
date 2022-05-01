package leetcode;

public class PalindromeNumber9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        int n = x;
        int newNr = 0;

        while(n > 0) {
            newNr = newNr * 10 + n % 10;
            n /= 10;
        }

        if (x == newNr)
            return true;

        return false;
    }
}
