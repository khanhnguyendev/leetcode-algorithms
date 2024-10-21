package com.khanhnguyen.twosum;

import java.util.HashMap;

/**
 * Problem: Two Sum.
 *
 * <p>This method takes an array of integers, `nums`, and an integer `target`. It finds two numbers
 * in the array such that their sum equals the target value and returns the indices of those two numbers.
 * It is guaranteed that there will be exactly one solution, and each input will have exactly one answer.</p>
 *
 * <p><strong>Function Signature:</strong></p>
 * <pre>
 * {@code
 * public static int[] solution(int[] nums, int target)
 * }
 * </pre>
 *
 * <p><strong>Examples:</strong></p>
 * <pre>
 * {@code
 * 1. Input: nums = [2, 7, 11, 15], target = 9
 *    Output: [0, 1]
 *
 * 2. Input: nums = [3, 2, 4], target = 6
 *    Output: [1, 2]
 *
 * 3. Input: nums = [3, 3], target = 6
 *    Output: [0, 1]
 * }
 * </pre>
 *
 * <p><strong>Hint:</strong></p>
 * <ul>
 *   <li>Use a HashMap to store the indices of the previously seen numbers as you iterate through the array.</li>
 *   <li>For each number, check if the complement (target - current number) exists in the map.</li>
 * </ul>
 *
 * @param nums the input array of integers
 * @param target the target sum
 * @return the indices of the two numbers whose sum equals the target
 */
public class TwoSum {

    public static int[] solution(int[] nums, int target) {
        HashMap<Integer, Integer> inputMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (inputMap.containsKey(complement)) {
                return new int[]{inputMap.get(complement), i};
            }

            inputMap.put(nums[i], i);
        }

        return null;
    }
}
