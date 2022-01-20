package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 20.01.2022
 */
public class _933_NumberOfRecentCallsTest {
    @Test
    public void test1() {
        _933_NumberOfRecentCalls obj = new _933_NumberOfRecentCalls();
        assertThat(obj.ping(1), is(1));
        assertThat(obj.ping(100), is(2));
        assertThat(obj.ping(3001), is(3));
        assertThat(obj.ping(3002), is(3));
    }

    @Test
    public void test2() {
        _933_NumberOfRecentCalls obj = new _933_NumberOfRecentCalls();
        assertThat(obj.ping(642), is(1));
        assertThat(obj.ping(1849), is(2));
        assertThat(obj.ping(4921), is(1));
        assertThat(obj.ping(5936), is(2));
        assertThat(obj.ping(5957), is(3));
    }
}