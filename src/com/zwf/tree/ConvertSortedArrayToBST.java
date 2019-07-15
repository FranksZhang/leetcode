package com.zwf.tree;


/**
 * 108. 有序数组转化成二叉查找树
 */
public class ConvertSortedArrayToBST {

    /**
     * 这个方法有点费空间，待优化
     *
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        if (nums.length == 1) {
            TreeNode result = new TreeNode(nums[0]);
            result.left = null;
            result.right = null;
            return result;
        }
        TreeNode root = new TreeNode(nums[nums.length / 2]);
        int[] leftNums = new int[nums.length / 2];
        int[] rightNums = new int[nums.length - nums.length / 2 -1];
        int j = 0;
        for (int i = 0; j < nums.length / 2; i++, j++)
            leftNums[i] = nums[j];
        j++;
        for (int i = 0; j < nums.length; i++, j++)
            rightNums[i] = nums[j];

        root.left = sortedArrayToBST(leftNums);
        root.right = sortedArrayToBST(rightNums);
        return root;
    }

    public static void main(String[] args) {
        ConvertSortedArrayToBST bst = new ConvertSortedArrayToBST();
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode result = bst.sortedArrayToBST(nums);
    }
}

