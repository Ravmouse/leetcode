package ru.vitaly;

import org.junit.Test;
import static org.junit.Assert.*;
import static ru.vitaly._125_ValidPalindrome.isPalindrome;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 21.01.2022
 */
public class _125_ValidPalindromeTest {
    @Test
    public void test1() {
        assertTrue(isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void test2() {
        assertFalse(isPalindrome("race a car"));
    }

    @Test
    public void test3() {
        assertTrue(isPalindrome(" "));
    }

    @Test
    public void test4() {
        assertTrue(isPalindrome(".,"));
    }

    @Test
    public void test6() {
        assertTrue(isPalindrome("abc, xyz abba ,zyx cba"));
    }

    @Test
    public void test7() {
        assertTrue(isPalindrome("Я не стар, брат Сеня"));
    }

    @Test
    public void test8() {
        assertTrue(isPalindrome("А роза упала на лапу Азора"));
    }
}