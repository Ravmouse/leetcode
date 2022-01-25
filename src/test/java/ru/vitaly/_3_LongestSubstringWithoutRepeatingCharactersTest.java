package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.vitaly._3_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 25.01.2022
 */
public class _3_LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void test1() {
        assertThat(lengthOfLongestSubstring("pwwkew"), is (3));
    }

    @Test
    public void test2() {
        assertThat(lengthOfLongestSubstring(" "), is (1));
    }

    @Test
    public void test3() {
        assertThat(lengthOfLongestSubstring("dvdf"), is (3));
    }

    @Test
    public void test4() {
        assertThat(lengthOfLongestSubstring("abcabcbb"), is (3));
    }

    @Test
    public void test5() {
        assertThat(lengthOfLongestSubstring("bbbbb"), is (1));
    }

    @Test
    public void test6() {
        assertThat(lengthOfLongestSubstring(""), is (0));
    }

    @Test
    public void test7() {
        assertThat(lengthOfLongestSubstring("abba"), is (2));
    }
}