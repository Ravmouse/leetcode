package ru.vitaly;
import java.util.Stack;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 29.09.2021
 */
public class _232_ImplementQueueUsingStacks {
    private final Stack<Integer> one;
    private final Stack<Integer> two;

    /** Initialize your data structure here. */
    public _232_ImplementQueueUsingStacks() {
        one = new Stack<>();
        two = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        one.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (two.empty()) {
            while(!one.empty()) {
                two.push(one.pop());
            }
        }
        return two.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (two.empty()) {
            while(!one.empty()) {
                two.push(one.pop());
            }
        }
        return two.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return one.empty() && two.empty();
    }
}