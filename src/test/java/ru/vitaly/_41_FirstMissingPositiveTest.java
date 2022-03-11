package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.vitaly._41_FirstMissingPositive.firstMissingPositive;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 */
public class _41_FirstMissingPositiveTest {
    @Test
    public void test1() {
        assertThat(firstMissingPositive(new int[] {1,2,0}), is(3));
    }

    @Test
    public void test2() {
        assertThat(firstMissingPositive(new int[] {3,4,-1,1}), is(2));
    }

    @Test
    public void test3() {
        assertThat(firstMissingPositive(new int[] {7,8,9,11,12}), is(1));
    }

    @Test
    public void test4() {
        assertThat(firstMissingPositive(new int[] {4,7,6,5,3,2}), is(1));
    }

    @Test
    public void test5() {
        assertThat(firstMissingPositive(new int[] {1}), is(2));
    }

    @Test
    public void test6() {
        assertThat(firstMissingPositive(new int[] {1, 1}), is(2));
    }

    @Test
    public void test7() {
        assertThat(firstMissingPositive(new int[] {2, 1}), is(3));
    }
}