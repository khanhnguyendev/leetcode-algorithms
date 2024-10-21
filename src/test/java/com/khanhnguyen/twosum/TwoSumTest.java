package com.khanhnguyen.twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Nguyen K. Ngo
 * @since 21-Oct-2024
 */
class TwoSumTest {

    @Test
    public void testExample1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.solution(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void testExample2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = TwoSum.solution(nums, target);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void testExample3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = TwoSum.solution(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void testEdgeCase1() {
        int[] nums = {1, 5, 5, 9};
        int target = 10;
        int[] result = TwoSum.solution(nums, target);
        assertArrayEquals(new int[]{1, 2}, result); // Using the same value twice
    }

    @Test
    public void testEdgeCase2() {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] result = TwoSum.solution(nums, target);
        assertArrayEquals(new int[]{0, 2}, result); // Including negative numbers
    }

    @Test
    public void testNoSolution() {
        int[] nums = {1, 2, 3, 4};
        int target = 8;
        int[] result = TwoSum.solution(nums, target);
        assertNull(result); // Assuming null is returned when no solution exists
    }

    @Test
    public void testLargeNumbers() {
        int[] nums = {1000000000, 200000000, 1000000000};
        int target = 200000000;
        int[] result = TwoSum.solution(nums, target);
        assertNull(result); // Large integers case
    }
}