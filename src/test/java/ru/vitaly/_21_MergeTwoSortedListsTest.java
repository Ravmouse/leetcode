package ru.vitaly;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static ru.vitaly._21_MergeTwoSortedLists.mergeTwoLists;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 07.01.2022
 */
public class _21_MergeTwoSortedListsTest {
    @Test
    public void test1() {
        ListNode l3 = new ListNode(4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        ListNode l6 = new ListNode(4);
        ListNode l5 = new ListNode(3, l6);
        ListNode l4 = new ListNode(1, l5);

        ListNode r6 = new ListNode(4);
        ListNode r5 = new ListNode(4, r6);
        ListNode r4 = new ListNode(3, r5);
        ListNode r3 = new ListNode(2, r4);
        ListNode r2 = new ListNode(1, r3);
        ListNode r1 = new ListNode(1, r2);
        assertEquals(mergeTwoLists(l1, l4), r1);
    }

    @Test
    public void test2() {
        ListNode l1 = null;
        ListNode l4 = null;
        ListNode r1 = null;
        assertEquals(mergeTwoLists(l1, l4), r1);
    }

    @Test
    public void test3() {
        ListNode l1 = null;
        ListNode l4 = new ListNode(0);
        ListNode r1 = new ListNode(0);
        assertEquals(r1, mergeTwoLists(l1, l4));
    }
}