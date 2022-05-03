package codingBat;

/*
https://codingbat.com/doc/practice/fizzbuzz-code.html
Based on a traditional English children's game
Print the numbers 1..100
For multiples of 3, print "Fizz" instead of the number
For multiples of 5, print "Buzz" instead of the number
For multiples of 3 and 5, print "FizzBuzz" instead of the number
Here: fill an array instead of printing + some other complications


Given a string str, if the string starts with "f" return "Fizz".
If the string ends with "b" return "Buzz".
If both the "f" and "b" conditions are true, return "FizzBuzz".
In all other cases, return the string unchanged.

fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
 */

public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println(fizzbuzz("fib"));
    }

    public static String fizzbuzz(String str) {
        String result = "";

        if (str.charAt(0) == 'f'  &&  (str.charAt(str.length()-1) == 'b')) {
            result = "FizzBuzz";
        } else if (str.charAt(str.length()-1) == 'b') {
            result = "Buzz";
        } else if (str.charAt(0) == 'f') {
            result = "Fizz";
        }

        return result;
    }

}
