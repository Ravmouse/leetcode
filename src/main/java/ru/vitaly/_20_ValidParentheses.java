package ru.vitaly;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 21.01.2022
 */
public class _20_ValidParentheses {
    //Без HashMap.
    public static boolean isValid0(String s) {
        char[] chars = s.toCharArray();
        if (chars[0] == ')' || chars[0] == '}' || chars[0] == ']') return false;
        Deque<Character> stack = new LinkedList<>();
        for (char c : chars) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.poll();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.poll();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.poll();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    //С HashMap.
    public static boolean isValid(String s) {
        if (s.charAt(0) == ']' || s.charAt(0) == ')' || s.charAt(0) == '}') return false;
        Deque<Character> d = new LinkedList<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                d.push(c);
            } else if (map.get(c) == d.peek()) {
                d.pop();
            } else {
                return false;
            }
        }
        return d.isEmpty();
    }
}