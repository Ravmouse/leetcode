package ru.vitaly;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 12.01.2022
 */
public class _283_MoveZeroes {
    public static void moveZeroes(int[] nums) {
        for (int i = 0, pos = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != pos) {
                    nums[pos++] = nums[i];
                    nums[i] = 0;
                } else {
                    pos++;
                }
            }
        }
    }
}