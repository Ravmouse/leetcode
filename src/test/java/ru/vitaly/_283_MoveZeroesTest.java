package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.vitaly._283_MoveZeroes.moveZeroes;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 12.01.2022
 */
public class _283_MoveZeroesTest {
    @Test
    public void moveZeroesTest1() {
        int[] m = new int[]{0,1,2,3,4};
        int[] r = new int[]{1,2,3,4,0};
        moveZeroes(m);
        assertThat(m, is(r));
    }

    @Test
    public void moveZeroesTest2() {
        int[] m = new int[]{1,0,2,3,4};
        int[] r = new int[]{1,2,3,4,0};
        moveZeroes(m);
        assertThat(m, is(r));
    }

    @Test
    public void moveZeroesTest3() {
        int[] m = new int[]{0,1,2,3,4,0,0,0};
        int[] r = new int[]{1,2,3,4,0,0,0,0};
        moveZeroes(m);
        assertThat(m, is(r));
    }

    @Test
    public void moveZeroesTest4() {
        int[] m = new int[]{0};
        int[] r = new int[]{0};
        moveZeroes(m);
        assertThat(m, is(r));
    }

    @Test
    public void moveZeroesTest5() {
        int[] m = new int[]{1,2,3,0,4,5,6,0,0,0,0,7,8,9,0,0,11};
        int[] r = new int[]{1,2,3,4,5,6,7,8,9,11,0,0,0,0,0,0,0};
        moveZeroes(m);
        assertThat(m, is(r));
    }

    @Test
    public void moveZeroesTest6() {
        int[] m = new int[]{1};
        int[] r = new int[]{1};
        moveZeroes(m);
        assertThat(m, is(r));
    }

    @Test
    public void moveZeroesTest7() {
        int[] m = new int[]{1,2,3};
        int[] r = new int[]{1,2,3};
        moveZeroes(m);
        assertThat(m, is(r));
    }

    @Test
    public void moveZeroesTest8() {
        int[] m = new int[]{0,0,1};
        int[] r = new int[]{1,0,0};
        moveZeroes(m);
        assertThat(m, is(r));
    }
}