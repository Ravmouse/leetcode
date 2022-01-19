package ru.vitaly;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 19.01.2022
 */
public class _88_MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) nums1[k--] = nums2[j--];
    }
}