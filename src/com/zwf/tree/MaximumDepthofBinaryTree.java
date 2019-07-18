package com.zwf.tree;

/**
 * 104
 */
public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
