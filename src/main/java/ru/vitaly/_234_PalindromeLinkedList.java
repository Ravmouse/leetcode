package ru.vitaly;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 11.09.2021
 */
public class _234_PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode otherHead = slow.next;
        slow.next = null;

        otherHead = reverseList(otherHead);

        while (otherHead != null) {
            if (otherHead.val != head.val) {
                return false;
            }
            otherHead = otherHead.next;
            head = head.next;
        }
        return true;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}