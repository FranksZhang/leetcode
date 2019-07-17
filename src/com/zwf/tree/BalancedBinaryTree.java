package com.zwf.tree;

/**
 * 110 判断是否为平衡二叉树
 */
public class BalancedBinaryTree {

    /**
     * TODO 好像速度不够快，分析下算法复杂度
     *
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return isBalanced(root.right) && isBalanced(root.left)
                && ((leftHeight - rightHeight) < 2 && (rightHeight - leftHeight) < 2);

    }

    public int getHeight(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

}
