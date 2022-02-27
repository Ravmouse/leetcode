package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.vitaly._14_LongestCommonPrefix.longestCommonPrefix;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 27.02.2022
 */
public class _14_LongestCommonPrefixTest {
    @Test
    public void test1() {
        assertThat(longestCommonPrefix(new String[] {"ab", "a"}), is("a"));
    }

    @Test
    public void test2() {
        assertThat(longestCommonPrefix(new String[] {"a", "aca", "acbb", "b"}), is(""));
    }

    @Test
    public void test3() {
        assertThat(longestCommonPrefix(new String[] {"fower", "flow", "flight"}), is("f"));
    }

    @Test
    public void test4() {
        assertThat(longestCommonPrefix(new String[] {"reflower", "flow", "flight"}), is(""));
    }

    @Test
    public void test5() {
        assertThat(longestCommonPrefix(new String[] {"dog", "racecar", "car"}), is(""));
    }

    @Test
    public void test6() {
        assertThat(longestCommonPrefix(new String[] {"climat", "climax", "climatology"}), is("clima"));
    }

    @Test
    public void test7() {
        assertThat(longestCommonPrefix(new String[] {"", "", ""}), is(""));
    }

    @Test
    public void test8() {
        assertThat(longestCommonPrefix(new String[] {"a"}), is("a"));
    }

    @Test
    public void test9() {
        assertThat(longestCommonPrefix(new String[] {"acc", "aaa", "aaba"}), is("a"));
    }

    @Test
    public void test10() {
        assertThat(longestCommonPrefix(new String[] {"abc", "abcdda", "abddcba"}), is("ab"));
    }

    @Test
    public void test11() {
        assertThat(longestCommonPrefix(new String[] {"caa", "", "a", "acb"}), is(""));
    }

    @Test
    public void test12() {
        assertThat(longestCommonPrefix(new String[] {"flower", "flower", "flower", "flower"}), is("flower"));
    }
}