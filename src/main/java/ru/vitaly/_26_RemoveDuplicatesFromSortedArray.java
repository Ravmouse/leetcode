package ru.vitaly;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 12.11.2021
 */
public class _26_RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int pos = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] && pos == 0) {
                pos = i;
            }
            if (nums[i] != nums[i - 1]) {
                if (pos == 0) {
                    pos = 2;
                } else {
                    nums[pos++] = nums[i];
                }
            }
        }
        return nums.length == 1 ? 1 : pos;
    }
}