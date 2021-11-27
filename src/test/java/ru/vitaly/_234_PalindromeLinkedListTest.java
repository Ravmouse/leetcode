package ru.vitaly;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static ru.vitaly._234_PalindromeLinkedList.isPalindrome;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 11.09.2021
 */
public class _234_PalindromeLinkedListTest {
    @Test
    public void testOne() {
        ListNode one = new ListNode(1, null);
        ListNode two_b = new ListNode(2, one);
        ListNode three_b = new ListNode(3, two_b);
        ListNode three = new ListNode(3, three_b);
        ListNode two = new ListNode(2, three);
        ListNode head = new ListNode(1, two);

        assertTrue(isPalindrome(head));
    }

    @Test
    public void testTwo() {
        ListNode two = new ListNode(2, null);
        ListNode head = new ListNode(1, two);

        assertFalse(isPalindrome(head));
    }

    @Test
    public void test_3() {
        ListNode one = new ListNode(1, null);
        ListNode two_b = new ListNode(2, one);
        ListNode three_b = new ListNode(3, two_b);
        ListNode three_2 = new ListNode(3, three_b);
        ListNode three_1 = new ListNode(3, three_2);
        ListNode three = new ListNode(3, three_1);
        ListNode two = new ListNode(2, three);
        ListNode head = new ListNode(1, two);

        assertTrue(isPalindrome(head));
    }

    @Test
    public void test_4() {
        ListNode one = new ListNode(1, null);
        ListNode two_b = new ListNode(2, one);
        ListNode three_b = new ListNode(3, two_b);
        ListNode three_3 = new ListNode(3, three_b);
        ListNode three_2 = new ListNode(3, three_3);
        ListNode three_1 = new ListNode(3, three_2);
        ListNode three = new ListNode(3, three_1);
        ListNode two = new ListNode(2, three);
        ListNode head = new ListNode(1, two);

        assertTrue(isPalindrome(head));
    }

    @Test
    public void test_5() {
        ListNode one = new ListNode(1, null);
        ListNode three_b = new ListNode(3, one);
        ListNode three_2 = new ListNode(3, three_b);
        ListNode three_1 = new ListNode(3, three_2);
        ListNode three = new ListNode(3, three_1);
        ListNode two = new ListNode(2, three);
        ListNode head = new ListNode(1, two);

        assertFalse(isPalindrome(head));
    }

    @Test
    public void test_6() {
        ListNode three = new ListNode(1, null);
        ListNode two = new ListNode(0, three);
        ListNode head = new ListNode(1, two);

        assertTrue(isPalindrome(head));
    }
}