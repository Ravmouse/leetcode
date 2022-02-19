package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.vitaly._1493_LongestSubarrayOf1AfterDeletingOneElement.longestSubarray;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 19.02.2022
 */
public class _1493_LongestSubarrayOf1AfterDeletingOneElementTest {
    @Test
    public void test1() {
        assertThat(longestSubarray(new int[] {1,1,0,1}), is(3));
    }

    @Test
    public void test2() {
        assertThat(longestSubarray(new int[] {0,1,1,1,0,1,1,0,1}), is(5));
    }

    @Test
    public void test3() {
        assertThat(longestSubarray(new int[] {1,1,1}), is(2));
    }

    @Test
    public void test4() {
        assertThat(longestSubarray(new int[] {0,0,1,0,0}), is(1));
    }

    @Test
    public void test5() {
        assertThat(longestSubarray(new int[] {0,0,1,1,0,1,1,1,0,1,1,0}), is(5));
    }
}