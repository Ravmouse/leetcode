package ru.vitaly;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 02.02.2022
 */
public class _1446_ConsecutiveCharacters {
    public static int maxPower(String s) {
        int cnt = 1, res = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cnt++;
                res = Math.max(res, cnt);
            } else {
                cnt = 1;
            }
        }
        return res;
    }
}