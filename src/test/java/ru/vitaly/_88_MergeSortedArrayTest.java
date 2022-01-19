package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.vitaly._88_MergeSortedArray.merge;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 19.01.2022
 */
public class _88_MergeSortedArrayTest {
    @Test
    public void test1() {
        int[] array = new int[] {1,2,3,0,0,0};
        merge(array, 3, new int[] {2,5,6}, 3);
        assertThat(array, is(new int[] {1, 2, 2, 3, 5, 6}));
    }

    @Test
    public void test2() {
        int[] array = new int[] {1};
        merge(array, 1, new int[] {}, 0);
        assertThat(array, is(new int[] {1}));
    }

    @Test
    public void test3() {
        int[] array = new int[] {0};
        merge(array, 0, new int[] {1}, 1);
        assertThat(array, is(new int[] {1}));
    }

    @Test
    public void test4() {
        int[] array = new int[] {1,3,7,10,15,0,0,0};
        merge(array, 5, new int[] {2,3,11}, 3);
        assertThat(array, is(new int[] {1,2,3,3,7,10,11,15}));
    }

    @Test
    public void test5() {
        int[] array = new int[] {1,3,7,10,15,0,0,0};
        merge(array, 5, new int[] {8,11,16}, 3);
        assertThat(array, is(new int[] {1,3,7,8,10,11,15,16}));
    }

    @Test
    public void test6() {
        int[] array = new int[] {10,15,0,0,0,0,0};
        merge(array, 2, new int[] {6,9,11,14,16}, 5);
        assertThat(array, is(new int[] {6,9,10,11,14,15,16}));
    }
}