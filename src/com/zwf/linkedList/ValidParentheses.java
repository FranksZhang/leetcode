package com.zwf.linkedList;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 20 检验括号
 */
public class ValidParentheses {

    public boolean isValid(String s) {

        char[][] patent = {{'[', ']'}, {'(', ')'}, {'{', '}'}};
        char[] str = s.toCharArray();
        LinkedList<Character> list = new LinkedList<>();
        for (char c : str) {
            boolean close = false;
            int tmp = 0;
            for (int i = 0; i < 3; i++) {
                if (patent[i][1] == c) {
                    close = true;
                    tmp = i;
                }
            }
            if (!close) {
                list.push(c);
            } else {
                if (list.isEmpty() || list.peek() != patent[tmp][0]) {
                    return false;
                } else {
                    list.pop();
                }
            }

        }
        if (!list.isEmpty())
            return false;

        return true;
    }

    public boolean isValid2(String s) {

        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses a = new ValidParentheses();
        System.out.println(a.isValid2("()"));

    }
}
