package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.vitaly._1_TwoSum.twoSum;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 10.09.2022
 */
public class _1_TwoSumTest {
    @Test
    public void testFirst() {
        int[] nums = {2, 7, 11, 15};
        int[] result = {0, 1};
        assertThat(twoSum(nums, 9), is(result));
    }

    @Test
    public void test2() {
        int[] nums = {3,5,8,2,0,4,3};
        int[] result = {1, 5};
        assertThat(twoSum(nums, 9), is(result));
    }

    @Test
    public void testSecond() {
        int[] nums = {3, 2, 4};
        int[] result = {1, 2};
        assertThat(twoSum(nums, 6), is(result));
    }

    @Test
    public void test1() {
        int[] nums = {3, 2, 3};
        int[] result = {0, 2};
        assertThat(twoSum(nums, 6), is(result));
    }

    @Test
    public void testThird() {
        int[] nums = {3, 3};
        int[] result = {0, 1};
        assertThat(twoSum(nums, 6), is(result));
    }

    @Test
    public void testFourth() {
        int[] nums = {9, 0, 18, 4, 2, 6, 1};
        int[] result = {3, 6};
        assertThat(twoSum(nums, 5), is(result));
    }

    @Test
    public void testFifth() {
        int[] nums = {-1,-2,-3,-4,-5};
        int[] result = {2, 4};
        assertThat(twoSum(nums, -8), is(result));
    }

    @Test
    public void testSixth() {
        int[] nums = {-3,4,3,90};
        int[] result = {0, 2};
        assertThat(twoSum(nums, 0), is(result));
    }
}