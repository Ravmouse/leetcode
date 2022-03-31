package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.vitaly._32_LongestValidParentheses.longestValidParentheses;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @since 30.03.2022
 */
public class _32_LongestValidParenthesesTest {
    @Test
    public void test1() {
        assertThat(longestValidParentheses("(()"), is(2));
    }

    @Test
    public void test2() {
        assertThat(longestValidParentheses(")()())"), is(4));
    }

    @Test
    public void test3() {
        assertThat(longestValidParentheses(""), is(0));
    }

    @Test
    public void test4() {
        assertThat(longestValidParentheses("()(())"), is(6));
    }

    @Test
    public void test5() {
        assertThat(longestValidParentheses("()(()"), is(2));
    }

    @Test
    public void test6() {
        assertThat(longestValidParentheses("()(()()()(()"), is(6));
    }

    @Test
    public void test7() {
        assertThat(longestValidParentheses("()(()()())(()"), is(10));
    }

    @Test
    public void test8() {
        assertThat(longestValidParentheses("("), is(0));
    }

    @Test
    public void test9() {
        assertThat(longestValidParentheses(")("), is(0));
    }

    @Test
    public void test10() {
        assertThat(longestValidParentheses("(()()"), is(4));
    }

    @Test
    public void test11() {
        assertThat(longestValidParentheses(")()())()()("), is(4));
    }

    @Test
    public void test12() {
        assertThat(longestValidParentheses(")(((((()())()()))()(()))("), is(22));
    }
}