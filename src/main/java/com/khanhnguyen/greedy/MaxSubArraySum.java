package com.khanhnguyen.greedy;

/**
 * Problem: Maximum Subarray Sum.
 *
 * <p>Write a function that takes an array of integers and returns the sum of the largest
 * contiguous subarray. The function should use an efficient approach (Kadane's Algorithm).</p>
 *
 * <p><strong>Function Signature:</strong></p>
 * <pre>
 * {@code
 * public static int maxSubArraySum(int[] nums)
 * }
 * </pre>
 *
 * <p><strong>Examples:</strong></p>
 * <pre>
 * {@code
 * 1. Input: nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}
 *    Output: 6
 *    Explanation: The subarray [4, -1, 2, 1] has the largest sum = 6.
 *
 * 2. Input: nums = {1}
 *    Output: 1
 *    Explanation: Since there's only one element, the max sum is the element itself.
 *
 * 3. Input: nums = {5, 4, -1, 7, 8}
 *    Output: 23
 *    Explanation: The subarray [5, 4, -1, 7, 8] has the largest sum = 23.
 * }
 * </pre>
 *
 * @param nums an array of integers (can contain both positive and negative values)
 * @return the maximum sum of the largest contiguous subarray
 */
public class MaxSubArraySum {

    public static int maxSubArraySum(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxCurrent = nums[0];
        int result = nums[0];
        for (int i=0; i<nums.length; i++) {
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            result = Math.max(maxCurrent, result);
        }

        return result;
    }
}
