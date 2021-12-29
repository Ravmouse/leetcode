package ru.vitaly;

import java.util.Objects;
/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 10.09.2021
 */
public class _206_ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode next;
        ListNode prev = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        if (next != null) {
            return String.format("val = %d, next = %s", val, next);
        } else {
            return String.format("val = %d", val);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ListNode node = (ListNode) obj;
        if (val != node.val) return false;
        return Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }
}