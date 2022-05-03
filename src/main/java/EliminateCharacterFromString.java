public class EliminateCharacterFromString {
    public static void main(String[] args) {
        String str = "goin!g !to !! interviews1#! nothi!here";

        System.out.println(eliminateCharactersFromString(str, '!'));

        System.out.println(str.replace("!",""));
    }

    public static String eliminateCharactersFromString(String str, char c) {

        String result = "";

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                continue;
            } else {
                result = result + str.charAt(i);
            }
        }

        return result;
    }
}
