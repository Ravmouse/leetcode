package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 29.09.2021
 */
public class _232_ImplementQueueUsingStacksTest {
    @Test
    public void test1() {
        _232_ImplementQueueUsingStacks stack = new _232_ImplementQueueUsingStacks();
        stack.push(1);
        stack.push(2);
        assertThat(stack.peek(), is(1));
        assertThat(stack.pop(), is(1));
        assertFalse(stack.empty());
    }

    @Test
    public void test2() {
        _232_ImplementQueueUsingStacks stack = new _232_ImplementQueueUsingStacks();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertThat(stack.peek(), is(1));
        assertThat(stack.pop(), is(1));
        stack.push(4);
        stack.push(5);
        stack.push(6);
        assertThat(stack.peek(), is(2));
        assertThat(stack.pop(), is(2));
        assertThat(stack.pop(), is(3));
        assertThat(stack.peek(), is(4));
        assertThat(stack.pop(), is(4));
        assertThat(stack.peek(), is(5));
        assertFalse(stack.empty());
    }

    @Test
    public void test3() {
        _232_ImplementQueueUsingStacks stack = new _232_ImplementQueueUsingStacks();
        stack.push(1);
        assertFalse(stack.empty());
    }
}