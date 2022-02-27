package ru.vitaly;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 27.02.2022
 */
public class _14_LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        int j = 0;
        while (j < strs[0].length()) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (strs[i] == null || strs[i].length() == 0) return "";
                if (strs[i].length() == j || strs[i + 1].length() == j) {
                    return  strs[i].substring(0, j);
                }
                char l = strs[i].charAt(j);
                char r = strs[i + 1].charAt(j);
                if (l != r) {
                    return strs[i].substring(0, j);
                }
            }
            j++;
        }
        return strs[0];
    }
}