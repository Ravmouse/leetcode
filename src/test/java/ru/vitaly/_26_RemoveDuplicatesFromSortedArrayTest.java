package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.vitaly._26_RemoveDuplicatesFromSortedArray.removeDuplicates;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 12.11.2021
 */
public class _26_RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void test1() {
        assertThat(removeDuplicates(new int[] {1,1,2}), is(2));
    }

    @Test
    public void test2() {
        assertThat(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}), is(5));
    }

    @Test
    public void test3() {
        assertThat(removeDuplicates(new int[] {1,2}), is(2));
    }
}