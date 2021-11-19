package ru.vitaly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Vitaly Vasilyev, date: 14.11.2021, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 14.11.2021
 */
public class _15_3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    result.add(List.of(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                }
                while (sum < 0 && l < r) {
                    l++;
                    sum = nums[i] + nums[l] + nums[r];
                }
                while (sum > 0 && r > l) {
                    r--;
                    sum = nums[i] + nums[l] + nums[r];
                }
            }
        }
        System.out.println(result);
        return result;
    }
}