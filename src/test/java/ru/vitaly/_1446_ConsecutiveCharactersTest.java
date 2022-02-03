package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static ru.vitaly._1446_ConsecutiveCharacters.maxPower;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 02.02.2022
 */
public class _1446_ConsecutiveCharactersTest {
    @Test
    public void test1() {
        assertThat(maxPower("leetcode"), is(2));
    }

    @Test
    public void test2() {
        assertThat(maxPower("abbcccddddeeeeedcba"), is(5));
    }

    @Test
    public void test3() {
        assertThat(maxPower("tourist"), is(1));
    }
}