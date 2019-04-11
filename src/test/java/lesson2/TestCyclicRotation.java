package lesson2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCyclicRotation {
    @Test
    public void test1() {
        int[] input = {3, 8, 9, 7, 6};
        int[] expected = {9, 7, 6, 3, 8};
        int[] result = CyclicRotation.solution(input, 3);
        Assert.assertArrayEquals(expected, result);
    }
    @Test
    public void test2() {
        int[] input = {3, 8, 9, 7, 6};
        int[] expected = {9, 7, 6, 3, 8};
        int[] result = CyclicRotation.solution(input, 3);
        Assert.assertArrayEquals(expected, result);
    }
    @Test
    public void test3() {
        int[] input = {1,2,3,4};
        int[] expected = {1,2,3,4,};
        int[] result = CyclicRotation.solution(input, 4);
        Assert.assertArrayEquals(expected, result);
    }
}
