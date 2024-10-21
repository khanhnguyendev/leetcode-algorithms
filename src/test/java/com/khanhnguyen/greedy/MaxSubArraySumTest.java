package com.khanhnguyen.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Nguyen K. Ngo
 * @since 29-Sep-2024
 */
class MaxSubArraySumTest {

    @Test
    public void testExample1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = MaxSubArraySum.maxSubArraySum(nums);
        assertEquals(6, result);  // The subarray [4, -1, 2, 1] has the largest sum
    }

    @Test
    public void testExample2() {
        int[] nums = {1};
        int result = MaxSubArraySum.maxSubArraySum(nums);
        assertEquals(1, result);  // Single element array
    }

    @Test
    public void testExample3() {
        int[] nums = {5, 4, -1, 7, 8};
        int result = MaxSubArraySum.maxSubArraySum(nums);
        assertEquals(23, result);  // The subarray [5, 4, -1, 7, 8] has the largest sum
    }

    @Test
    public void testAllNegativeNumbers() {
        int[] nums = {-5, -3, -1, -2};
        int result = MaxSubArraySum.maxSubArraySum(nums);
        assertEquals(-1, result);  // The maximum sum is the least negative number (-1)
    }

    @Test
    public void testMixedPositiveAndNegative() {
        int[] nums = {-2, -1, 3, 4, -1, 2, -5, 1};
        int result = MaxSubArraySum.maxSubArraySum(nums);
        assertEquals(8, result);  // The subarray [3, 4, -1, 2] has the largest sum
    }
}