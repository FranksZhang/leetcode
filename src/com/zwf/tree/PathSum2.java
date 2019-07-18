package com.zwf.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 113 
 */
public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null)
            return result;
        hasPath(result, new LinkedList<>(), root, sum);
        return result;
    }

    private void hasPath(List<List<Integer>> result, List<Integer> path, TreeNode root, int sum) {
        if (root == null)
            return;
        path.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            List<Integer> tmp = new ArrayList<>(path);
            result.add(tmp);
            path.remove(path.size() - 1);
            return ;
        }
        hasPath(result, path, root.left, sum - root.val);
        hasPath(result, path, root.right, sum - root.val);
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        PathSum2 sum2 = new PathSum2();
        TreeNode left = new TreeNode(1, null, null);
        TreeNode root = new TreeNode(2, left, null);

        sum2.pathSum(root, 3);

    }
}
