package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.vitaly._849_MaximizeDistanceToClosestPerson.maxDistToClosest;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 05.02.2022
 */
public class _849_MaximizeDistanceToClosestPersonTest {
    @Test
    public void test1() {
        assertThat(maxDistToClosest(new int[] {1,0}), is(1));
        assertThat(maxDistToClosest(new int[] {0,1}), is(1));
        assertThat(maxDistToClosest(new int[] {1,0,1}), is(1));
        assertThat(maxDistToClosest(new int[] {0,1,0}), is(1));
        assertThat(maxDistToClosest(new int[] {1,0,0,1}), is(1));
        assertThat(maxDistToClosest(new int[] {1,0,0,0,1}), is(2));
        assertThat(maxDistToClosest(new int[] {1,0,0,0,0,1}), is(2));
        assertThat(maxDistToClosest(new int[] {1,0,0,0,1,0,0,0,0,1}), is(2));
        assertThat(maxDistToClosest(new int[] {1,0,0,0,1,0,0,0,0,0,1}), is(3));
        assertThat(maxDistToClosest(new int[] {1,0,0,0,0,0,1}), is(3));
        assertThat(maxDistToClosest(new int[] {0,0,0,0,0,0,0,1}), is(7));
        assertThat(maxDistToClosest(new int[] {0,0,0,1,0,0,0,0}), is(4));
        assertThat(maxDistToClosest(new int[] {0,1,0,0,0,0,0,0}), is(6));
        assertThat(maxDistToClosest(new int[] {1,0,0,0,0,0,0,0}), is(7));
        assertThat(maxDistToClosest(new int[] {0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,1}), is(6));
    }
}