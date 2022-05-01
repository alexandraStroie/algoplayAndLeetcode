
/*
input: "ghhrkkb"
output: "ghrkb"
 */
public class NoDoubleLettersInAString {

    public static void main(String[] args) {
        System.out.println(noDoubleLetters("ghhrkkb"));
        System.out.println(noDoubleLetters("ghhrkkbnmrll"));

    }
    
    public static String noDoubleLetters(String str) {
        StringBuilder newStr = new StringBuilder();

        int j = 1;
        for(int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i+1)) {
                newStr.append(str.charAt(i));
            }
            j++;
        }

        newStr.append(str.charAt(j-1));
        return newStr.toString();
    }
    
    
}
