package ru.vitaly;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.vitaly._15_3Sum.threeSum;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 01.02.2022
 */
public class _15_3SumTest {
    @Test
    public void test1() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(-1,-1,2));
        list.add(List.of(-1,0,1));
        assertThat(threeSum(new int[] {-1,0,1,2,-1,-4}), is(list));
    }

    @Test
    public void test2() {
        assertThat(threeSum(new int[] {}), is(Collections.emptyList()));
    }

    @Test
    public void test3() {
        assertThat(threeSum(new int[] {0}), is(Collections.emptyList()));
    }

    @Test
    public void test4() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(0,0,0));
        assertThat(threeSum(new int[] {0,0,0,0}), is(list));
    }

    @Test
    public void test5() {
        assertThat(threeSum(new int[] {1,2,-2,-1}), is(Collections.emptyList()));
    }

    @Test
    public void test6() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(-2,-1,3));
        list.add(List.of(-2,0,2));
        list.add(List.of(-1,0,1));
        assertThat(threeSum(new int[] {3,0,-2,-1,1,2}), is(list));
    }

    @Test
    public void test7() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(-2,0,2));
        assertThat(threeSum(new int[] {-2,0,0,2,2}), is(list));
    }

    @Test
    public void test8() {
        assertThat(threeSum(new int[] {1,0,-4}), is(Collections.emptyList()));
    }

    @Test
    public void test9() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(-4,0,4));
        list.add(List.of(-4,1,3));
        list.add(List.of(-3,-1,4));
        list.add(List.of(-3,0,3));
        list.add(List.of(-3,1,2));
        list.add(List.of(-2,-1,3));
        list.add(List.of(-2,0,2));
        list.add(List.of(-1,-1,2));
        list.add(List.of(-1,0,1));
        assertThat(threeSum(new int[] {-1,0,1,2,-1,-4,-2,-3,3,0,4}), is(list));
    }

    @Test
    public void test10() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(-4,-2,6));
        list.add(List.of(-4,0,4));
        list.add(List.of(-4,1,3));
        list.add(List.of(-4,2,2));
        list.add(List.of(-2,-2,4));
        list.add(List.of(-2,0,2));
        assertThat(threeSum(new int[] {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6}), is(list));
    }
}