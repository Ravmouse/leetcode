package ru.vitaly;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 22.12.2021
 */
public class _228_SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        int left = 0;
        int right = 0;
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length) {
                addToList(left, right, list, nums);
                break;
            }
            if (nums[i] - nums[i - 1] == 1) {
                right++;
            } else {
                addToList(left, right, list, nums);
                left = i;
                right = i;
            }
        }
        return list;
    }

    public static void addToList(int left, int right, List<String> list, int[] nums) {
        if (left == right) {
            list.add(String.format("%d", nums[left]));
        } else {
            list.add(String.format("%d->%d", nums[left], nums[right]));
        }
    }
}