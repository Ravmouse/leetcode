package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.vitaly._977_SquaresOfASortedArray.sortedSquares;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @since 19.03.2022
 */
public class _977_SquaresOfASortedArrayTest {
    @Test
    public void test1() {
        assertThat(sortedSquares(new int[] {-4,-1,0,3,10}), is(new int[] {0,1,9,16,100}));
    }

    @Test
    public void test2() {
        assertThat(sortedSquares(new int[] {-7,-3,2,3,11}), is(new int[] {4,9,9,49,121}));
    }

    @Test
    public void test3() {
        assertThat(sortedSquares(new int[] {-1}), is(new int[] {1}));
    }

    @Test
    public void test4() {
        assertThat(sortedSquares(new int[] {-5,-3,-2,-1}), is(new int[] {1,4,9,25}));
    }

    @Test
    public void test5() {
        assertThat(sortedSquares(new int[]{1,2,2,3,3,4,11,11}), is(new int[] {1,4,4,9,9,16,121,121}));
    }
}