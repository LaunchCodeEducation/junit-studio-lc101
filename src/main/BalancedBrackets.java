package main;


public class BalancedBrackets {
    /**
    *
    * @param str - to be validated
    * @return true if balanced, false otherwise
    */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
            } else if (ch == ']') {
                brackets--;
            }
        }
        return brackets == 0;
    }
}
