package ru.vitaly;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.vitaly._228_SummaryRanges.summaryRanges;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 23.12.2021
 */
public class _228_SummaryRangesTest {
    @Test
    public void test1() {
        assertThat(summaryRanges(new int[] {0,1,2,4,5,7}), is(List.of("0->2","4->5","7")));
    }

    @Test
    public void test2() {
        assertThat(summaryRanges(new int[] {0,2,3,4,6,8,9}), is(List.of("0","2->4","6","8->9")));
    }

    @Test
    public void test3() {
        assertThat(summaryRanges(new int[] {}), is(List.of()));
    }

    @Test
    public void test4() {
        assertThat(summaryRanges(new int[] {-1}), is(List.of("-1")));
    }

    @Test
    public void test5() {
        assertThat(summaryRanges(new int[] {0}), is(List.of("0")));
    }
}