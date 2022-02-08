package ru.vitaly;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.vitaly._1450_NumberOfStudentsDoingHomeworkAtAGivenTime.busyStudent;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 08.02.2022
 */
public class _1450_NumberOfStudentsDoingHomeworkAtAGivenTimeTest {
    @Test
    public void test1() {
        assertThat(busyStudent(new int[] {1,2,3}, new int[] {3,2,7}, 4), is(1));
        assertThat(busyStudent(new int[] {4}, new int[] {4}, 4), is(1));
    }
}