package ru.vitaly;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 05.02.2022
 */
public class _849_MaximizeDistanceToClosestPerson {
    public static int maxDistToClosest(int[] seats) {
        int left = 0;
        int right = seats.length - 1;
        int max = 0, cnt = 0;
        while (seats[left] == 0) left++;
        while (seats[right] == 0) right--;
        for (int i = left + 1; i < right; i++) {
            if (seats[i] == 0) {
                cnt++;
                max = Math.max(max, cnt);
            } else {
                cnt = 0;
            }
        }
        max = max % 2 == 0 ? max / 2 : (max / 2 + 1);
        return Math.max(max, Math.max(left, seats.length - right - 1));
    }
}