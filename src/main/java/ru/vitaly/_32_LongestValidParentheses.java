package ru.vitaly;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @since 30.03.2022
 */
public class _32_LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        int left = 0, right = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') left++;
            else right++;

            if (left == right) {
                max = Math.max(max, right * 2);
            }
            else if (right >= left) {
                left = right = 0;
            }
        }
        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')') right++;
            else left++;

            if (right == left) {
                max = Math.max(max, left * 2);
            }
            else if (left >= right) {
                left = right = 0;
            }
        }
        return max;
    }
}