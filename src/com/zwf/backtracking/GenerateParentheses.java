package com.zwf.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 22 生成括号， 回溯法
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        backtrack(result, "", 0, 0, n);

        return result;
    }

    public void backtrack(List<String> result, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            result.add(str);
            return;
        }

        if (open < max) {
            backtrack(result, str + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, str + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> result = generateParentheses.generateParenthesis(3);
    }
}
