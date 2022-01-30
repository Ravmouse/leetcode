package ru.vitaly;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 30.01.2022
 */
public class _2_AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur = new ListNode();
        ListNode head = cur;
        int div;
        while (l1 != null && l2 != null) {
            div = sum(cur, l1.val, l2.val);
            l1 = l1.next;
            l2 = l2.next;
            if (l1 == null && l2 == null && div == 0) break;
            cur.next = new ListNode(div);
            cur = cur.next;
        }
        while (l1 != null) {
            div = sum(cur, l1.val, 0);
            l1 = l1.next;
            if (l1 == null && div == 0) break;
            cur.next = new ListNode(div);
            cur = cur.next;
        }
        while (l2 != null) {
            div = sum(cur, 0, l2.val);
            l2 = l2.next;
            if (l2 == null && div == 0) break;
            cur.next = new ListNode(div);
            cur = cur.next;
        }
        System.out.println(head);
        return head;
    }

    public static int sum(ListNode cur, int v1, int v2) {
        int tmp = v1 + v2 + cur.val;
        cur.val = tmp % 10;
        return tmp / 10;
    }
}