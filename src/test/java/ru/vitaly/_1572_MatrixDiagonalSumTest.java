package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.vitaly._1572_MatrixDiagonalSum.diagonalSum;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 01.03.2022
 */
public class _1572_MatrixDiagonalSumTest {
    @Test
    public void test1() {
        assertThat(diagonalSum(new int[][] {{1,2,3},{4,5,6},{7,8,9}}), is(25));
    }

    @Test
    public void test2() {
        assertThat(diagonalSum(new int[][] {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}}), is(8));
    }

    @Test
    public void test3() {
        assertThat(diagonalSum(new int[][] {{5}}), is(5));
    }
}