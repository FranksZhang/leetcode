package com.zwf;

/**
 * 283 算法待优化
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int zeroIndex = -1;
        if (nums.length <= 1)
            return;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0 && zeroIndex == -1) {
                zeroIndex = i;
                continue;
            }
            if (nums[i] != 0 && zeroIndex != -1) {
                int temp = nums[i];
                int j = i;
                while (zeroIndex < j) {
                    nums[j] = 0;
                    j--;
                }
                nums[zeroIndex] = temp;
                zeroIndex = j+1;
            }
        }
    }
}
