package ru.vitaly;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static ru.vitaly._392_IsSubsequence.isSubsequence;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 14.09.2021
 */
public class _392_IsSubsequenceTest {
    @Test
    public void test1() {
        assertTrue(isSubsequence("abc" , "ahbgdc"));
    }

    @Test
    public void test2() {
        assertFalse(isSubsequence("axc" , "ahbgdc"));
    }

    @Test
    public void test3() {
        assertTrue(isSubsequence("ace" , "abcde"));
    }
}