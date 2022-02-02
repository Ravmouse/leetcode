package ru.vitaly;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 02.02.2022
 */
public class _443_StringCompression {
    public static int compress(char[] chars) {
        int count = 1;
        int pos = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                pos = modify(chars, chars[i - 1], count, pos);
                count = 1;
            }
        }
        pos = modify(chars, chars[chars.length - 1], count, pos);
        return pos;
    }

    public static int modify(char[] chars, char c, int count, int pos) {
        chars[pos++] = c;
        if (count > 1 && count < 10) {
            chars[pos++] = (char) ('0' + count);
        } else if (count >= 10) {
            int tmp = count;
            int len = 0;
            while (tmp != 0) {
                tmp = tmp / 10;
                len++;
            }
            int len_2 = pos + len;
            while (len != 0) {
                chars[pos + len - 1] = (char) ('0' + count % 10);
                count = count / 10;
                len--;
            }
            pos = len_2;
        }
        return pos;
    }
}