package ru.vitaly;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 21.01.2022
 */
public class _125_ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (Character.isLetterOrDigit(s.charAt(i)) &&
                    Character.isLetterOrDigit(s.charAt(j)) &&
                    Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
                i++;
                j--;
            } else if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else return false;
        }
        return true;
    }
}