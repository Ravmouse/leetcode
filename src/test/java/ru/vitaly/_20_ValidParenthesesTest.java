package ru.vitaly;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static ru.vitaly._20_ValidParentheses.isValid;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 21.01.2022
 */
public class _20_ValidParenthesesTest {
    @Test
    public void test1() {
        assertTrue(isValid("()"));
    }

    @Test
    public void test2() {
        assertTrue(isValid("()[]{}"));
    }

    @Test
    public void test3() {
        assertFalse(isValid("(]"));
    }

    @Test
    public void test4() {
        assertFalse(isValid("([)]"));
    }

    @Test
    public void test5() {
        assertFalse(isValid("()()))(())"));
    }

    @Test
    public void test6() {
        assertFalse(isValid("["));
    }

    @Test
    public void test7() {
        assertTrue(isValid("{({[]({})})}"));
    }

    @Test
    public void test8() {
        assertFalse(isValid("(])"));
    }
}