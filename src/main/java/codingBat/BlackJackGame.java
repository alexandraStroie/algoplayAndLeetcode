package codingBat;/*

Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.

https://codingbat.com/prob/p117019

Return 0 if they both go over.
blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
 */

public class BlackJackGame {
    public static void main(String[] args) {
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(22, 19));
    }

    public static int blackjack(int a, int b) {
        if(a >= 22 && b >= 22) {
            return 0;
        }

        if (Math.max(a,b) <= 21) {
            return Math.max(a,b);
        }

        if(a >= 22) {
            return b;
        } else {
            return a;
        }

   }

}
