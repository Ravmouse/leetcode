package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.vitaly._28_ImplementstrStr.strStr;

/**
 * @author Vitaly Vasilyev, date: 13.09.2021, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 13.09.2021
 */
public class _28_ImplementstrStrTest {
    @Test
    public void test_1() {
        assertThat(strStr("hello", "ll"), is(2));
        assertThat(strStr("aaaaa", "bba"), is(-1));
        assertThat(strStr("", ""), is(0));
        assertThat(strStr("", "a"), is(-1));
        assertThat(strStr("a", ""), is(0));
        assertThat(strStr("aaa", "aaaa"), is(-1));
        assertThat(strStr("mississippi", "issip"), is(4));
    }
}