package ru.vitaly;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static ru.vitaly._234_PalindromeLinkedList.isPalindrome;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 25.12.2021
 */
public class _234_PalindromeLinkedListTest {
    @Test
    public void test1() {
        ListNode one = new ListNode(1);
        ListNode two_b = new ListNode(2, one);
        ListNode three_b = new ListNode(3, two_b);
        ListNode three = new ListNode(3, three_b);
        ListNode two = new ListNode(2, three);
        ListNode head = new ListNode(1, two);
        assertTrue(isPalindrome(head));
    }

    @Test
    public void test2() {
        ListNode two = new ListNode(2);
        ListNode head = new ListNode(1, two);
        assertFalse(isPalindrome(head));
    }

    @Test
    public void test3() {
        ListNode one = new ListNode(1);
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
    public void test4() {
        ListNode one = new ListNode(1);
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
    public void test5() {
        ListNode one = new ListNode(1);
        ListNode three_b = new ListNode(3, one);
        ListNode three_2 = new ListNode(3, three_b);
        ListNode three_1 = new ListNode(3, three_2);
        ListNode three = new ListNode(3, three_1);
        ListNode two = new ListNode(2, three);
        ListNode head = new ListNode(1, two);
        assertFalse(isPalindrome(head));
    }

    @Test
    public void test6() {
        ListNode three = new ListNode(1);
        ListNode two = new ListNode(0, three);
        ListNode head = new ListNode(1, two);
        assertTrue(isPalindrome(head));
    }

    @Test
    public void test7() {
        ListNode three = new ListNode(0);
        ListNode two = new ListNode(0, three);
        ListNode head = new ListNode(1, two);
        assertFalse(isPalindrome(head));
    }

    @Test
    public void test8() {
        ListNode head = new ListNode(1);
        assertTrue(isPalindrome(head));
    }
}