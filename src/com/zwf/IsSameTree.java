package com.zwf;

/**
 * 100
 */
public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;
        else {
            boolean flag = isSameTree(p.left, q.left);
            if(!flag)
                return false;
            flag = isSameTree(p.right, q.right);
            return flag;
        }

    }
}

class TreeNode1 {

    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int x) {
        val = x;
    }
}
