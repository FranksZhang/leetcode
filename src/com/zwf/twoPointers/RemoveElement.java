package com.zwf.twoPointers;

/**
 * 27
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;

        int tempIndex = 0;
        for (int num : nums) {
            if (num != val)
                nums[tempIndex++] = num;
        }

        return tempIndex;
    }
}
