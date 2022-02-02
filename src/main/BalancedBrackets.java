package main;

public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     * <p>
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     * <p>
     * The string may contain non-bracket characters as well.
     * <p>
     * These strings have balanced brackets:
     * "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     * <p>
     * While these do not:
     * "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        StringBuilder bracketsStringBuilder = new StringBuilder();
        int brackets = 0;
        boolean matchedSet = false;
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                bracketsStringBuilder.append("[");
                brackets++;
                count++;
            } else if (ch == ']') {
                brackets--;
                bracketsStringBuilder.append("]");
                count++;
            }
            if (count == 2 && bracketsStringBuilder.toString().equals("[]")) {
                matchedSet = true;
                count = 0;
                bracketsStringBuilder.delete(0, bracketsStringBuilder.length());
            } else if (count == 2) {
                matchedSet = false;
                count = 0;
            }
        }
        return matchedSet && brackets == 0;
    }
}
