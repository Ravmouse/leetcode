package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static ru.vitaly._443_StringCompression.compress;

/**
 * @author Vitaly Vasilyev, date: 17.11.2021, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 02.02.2022
 */
public class _443_StringCompressionTest {
    @Test
    public void test1() {
        final char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        assertThat(compress(chars), is(6));
        assertArrayEquals(new char[] {'a', '2', 'b', '2', 'c', '3', 'c'}, chars);
    }

    @Test
    public void test2() {
        final char[] chars = {'a'};
        assertThat(compress(chars), is(1));
        assertArrayEquals(new char[] {'a'}, chars);
    }

    @Test
    public void test3() {
        final char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        assertThat(compress(chars), is(4));
        assertArrayEquals(new char[] {'a','b','1','2','b','b','b','b','b','b','b','b','b'}, chars);
    }

    @Test
    public void test4() {
        final char[] chars = {'a','a','a','b','b','a','a'};
        assertThat(compress(chars), is(6));
        assertArrayEquals(new char[] {'a','3','b','2','a','2','a'}, chars);
    }

    @Test
    public void test5() {
        final char[] chars = {'a','b','c'};
        assertThat(compress(new char[] {'a','b','c'}), is(3));
        assertArrayEquals(new char[] {'a','b','c'}, chars);
    }

    @Test
    public void test6() {
        final char[] chars = {'a','b','c','d','e','f','g','g','g','g','g','g','g','g','g','g','g','g','a', 'b','c'};
        assertThat(compress(chars), is(12));
        assertArrayEquals(new char[] {'a','b','c','d','e','f','g','1','2','a','b','c','g','g','g','g','g','g','a', 'b','c'}, chars);
    }

    @Test
    public void test7() {
        final char[] chars = {'a','a','a','a','a','b'};
        assertThat(compress(chars), is(3));
        assertArrayEquals(new char[] {'a','5','b','a','a','b'}, chars);
    }

    @Test
    public void test8() {
        final char[] chars = {'a', 'a'};
        assertThat(compress(chars), is(2));
        assertArrayEquals(new char[] {'a', '2'}, chars);
    }

    @Test
    public void test9() {
        final char[] chars = {'a', 'a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'x', 'y', 'z', 'd', 'd', 'd', 'd', 'e', 'e',
                'e', 'f', 'f', 'f', 'a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b',
                'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        assertThat(compress(chars), is(20));
        assertArrayEquals(new char[] {'a', '4', 'b', '3', 'c', '2', 'x', 'y', 'z', 'd', '4', 'e', '3', 'f', '3', 'a', '6', 'b',
                '2', '8', 'f', 'f', 'a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b',
                'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}, chars);
    }

    @Test
    public void test10() {
        final char[] chars = {'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'};
        assertThat(compress(chars), is(3));
        assertArrayEquals(new char[] {'o', '1', '0', 'o', 'o', 'o', 'o', 'o', 'o', 'o'}, chars);
    }
}