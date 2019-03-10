package com.zwf.twoPointers;

/**
 * 26
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;

        int id = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1])
                nums[id++] = nums[i];
        }
        return id;
    }

    public static void main(String[] args) {
        RemoveDuplicates d = new RemoveDuplicates();
        int[] a = {1,1,2};
        System.out.println(d.removeDuplicates(a));
    }
}
