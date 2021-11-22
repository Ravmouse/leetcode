package ru.vitaly;

/**
 * @author Vitaly Vasilyev, date: 12.09.2021, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 12.09.2021
 */
public class _41_FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1) {
                if (nums[i] <= 0 || nums[i] >= length) break;
                if (nums[i] == nums[nums[i] - 1]) break;

                int tmp = nums[i];
                nums[i] = nums[tmp - 1];
                nums[tmp - 1] = tmp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) return i + 1;
        }
        return length + 1;
    }
}