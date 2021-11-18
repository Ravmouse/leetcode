package ru.vitaly;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static ru.vitaly._206_ReverseLinkedList.reverseList;
/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 10.09.2021
 */
public class _206_ReverseLinkedListTest {
    @Test
    public void testOne() {
        ListNode l4 = new ListNode(5);
        ListNode l3 = new ListNode(4, l4);
        ListNode l2 = new ListNode(3, l3);
        ListNode l1 = new ListNode(2, l2);
        ListNode head = new ListNode(1, l1);

        ListNode l4_ = new ListNode(1);
        ListNode l3_ = new ListNode(2, l4_);
        ListNode l2_ = new ListNode(3, l3_);
        ListNode l1_ = new ListNode(4, l2_);
        ListNode head_ = new ListNode(5, l1_);

        assertEquals(reverseList(head), head_);
    }

    @Test
    public void testTwo() {
        ListNode l1 = new ListNode(2);
        ListNode head = new ListNode(1, l1);

        ListNode l1_ = new ListNode(1);
        ListNode head_ = new ListNode(2, l1_);

        assertEquals(reverseList(head), head_);
    }
}