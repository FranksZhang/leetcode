
package com.zwf.twoPointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 80 去除重复
 */
public class RemoveDupSortArray2 {

    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, 2);
            } else {
                list.add(num);
                map.put(num, 1);
            }
        }
        int i = 0;
        for (Integer num : list) {
            for ( int j = 0; j < map.get(num); j++) {
                nums[i++] = num;
            }
        }

        return i;

    }

    public static void main(String[] args) {
        RemoveDupSortArray2 array2 = new RemoveDupSortArray2();
        int[] nums = {1,1,2,2,2,3};
        System.out.println(array2.removeDuplicates(nums));
    }
}