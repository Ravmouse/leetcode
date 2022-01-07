package ru.vitaly;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 07.01.2022
 */
public class _21_MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;
        ListNode cur;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }
        cur = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        while (list1 != null) {
            cur.next = list1;
            cur = list1;
            list1 = list1.next;
        }
        while (list2 != null) {
            cur.next = list2;
            cur = list2;
            list2 = list2.next;
        }
        return head;
    }
}