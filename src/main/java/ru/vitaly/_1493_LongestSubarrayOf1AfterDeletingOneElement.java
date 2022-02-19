package ru.vitaly;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 19.02.2022
 */
public class _1493_LongestSubarrayOf1AfterDeletingOneElement {
    public static int longestSubarray(int[] nums) {
        int cnt = 0;
        int cur = 0;
        int res = 0;
        for (int i : nums) {
            cnt++;
            if (i == 0) {
                cur = cnt;
                cnt = 0;
            }
            res = Math.max(res, cur + cnt);
        }
        if (cnt == nums.length) {
            return cnt - 1;
        }
        return res - 1;
    }
}