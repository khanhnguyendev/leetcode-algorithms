package com.khanhnguyen.twosum;

import java.util.HashMap;

/**
 * @author Nguyen K. Ngo
 * @since 21-Oct-2024
 */
public class TwoSum {

    public static int[] solution(int[] nums, int target) {
        HashMap<Integer, Integer> inputMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (inputMap.containsKey(complement))
                return new int[]{inputMap.get(complement), i};

            inputMap.put(nums[i], i);
        }

        return null;
    }
}
