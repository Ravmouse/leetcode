package ru.vitaly;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 20.01.2022
 */

//public class _933_NumberOfRecentCalls {
//    private final List<Integer> requests = new ArrayList<>();
//    private int pos;
//
//    public _933_NumberOfRecentCalls() {}
//
//    public int ping(int t) {
//        requests.add(t);
//        while (t - requests.get(pos) > 3000) {
//            pos++;
//        }
//        return requests.size() - pos;
//    }
//}

public class _933_NumberOfRecentCalls {
    private final Queue<Integer> q;

    public _933_NumberOfRecentCalls() {
        q = new ArrayDeque<>();
    }

    public int ping(int t) {
        q.offer(t);
        while (!q.isEmpty() && t - q.peek() > 3000) {
            q.poll();
        }
        return q.size();
    }
}