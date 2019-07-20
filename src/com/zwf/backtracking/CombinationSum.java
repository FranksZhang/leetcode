package com.zwf.backtracking;

import static com.sun.tools.doclint.Entity.sum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 39 组合数，回溯法
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0)
            return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sumList = new LinkedList<>();
        for (int i = 0; i < candidates.length; i++)
            getSum(result, sumList, 0, candidates, target, i);
        return result;
    }

    private void getSum(List<List<Integer>> result, List<Integer> sumList,
                        int sum, int[] candidates, int target, int index) {
        sum += candidates[index];
        if (sum == target) {
            List<Integer> tmp = new LinkedList<>(sumList);
            tmp.add(candidates[index]);
            result.add(tmp);
            return;
        }
        if (sum > target) {
            return;
        }

        sumList.add(candidates[index]);
        for (int i = index; i < candidates.length; i++) {
            getSum(result, sumList, sum, candidates, target, i);
        }
        sumList.remove(sumList.size() - 1);
    }

    public static void main(String[] args) {
        CombinationSum sum = new CombinationSum();
        int[] a = {2, 3, 6, 7};

        sum.combinationSum(a, 7);
    }
}