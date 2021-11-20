package ru.vitaly;

/**
 * @author Vitaly Vasilyev, date: 13.09.2021, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 13.09.2021
 */
public class _28_ImplementstrStr {
    public static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (strEquals(haystack.substring(i, needle.length() + i), needle)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean strEquals(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}