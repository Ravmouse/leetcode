package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.vitaly._2_AddTwoNumbers.addTwoNumbers;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 24.01.2022
 */
public class _2_AddTwoNumbersTest {
    @Test
    public void test1() {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);
        l4.next = l5;
        l5.next = l6;

        ListNode l7 = new ListNode(7);
        ListNode l8 = new ListNode(0);
        ListNode l9 = new ListNode(8);
        l7.next = l8;
        l8.next = l9;
        assertThat(addTwoNumbers(l1, l4), is(l7));
    }

    @Test
    public void test2() {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);
        ListNode l3 = new ListNode(9);
        ListNode l4 = new ListNode(9);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(9);
        ListNode l7 = new ListNode(9);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;

        ListNode l8 = new ListNode(9);
        ListNode l9 = new ListNode(9);
        ListNode l10 = new ListNode(9);
        ListNode l11 = new ListNode(9);
        l8.next = l9;
        l9.next = l10;
        l10.next = l11;

        ListNode l_1 = new ListNode(8);
        ListNode l_2 = new ListNode(9);
        ListNode l_3 = new ListNode(9);
        ListNode l_4 = new ListNode(9);
        ListNode l_5 = new ListNode(0);
        ListNode l_6 = new ListNode(0);
        ListNode l_7 = new ListNode(0);
        ListNode l_8 = new ListNode(1);
        l_1.next = l_2;
        l_2.next = l_3;
        l_3.next = l_4;
        l_4.next = l_5;
        l_5.next = l_6;
        l_6.next = l_7;
        l_7.next = l_8;
        assertThat(addTwoNumbers(l1, l8), is(l_1));
    }

    @Test
    public void test3() {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);

        ListNode l3 = new ListNode(0);
        l3.next = new ListNode(1);
        assertThat(addTwoNumbers(l1, l2), is(l3));
    }
}