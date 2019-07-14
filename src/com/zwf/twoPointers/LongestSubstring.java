package com.zwf.twoPointers;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. 最长子串长度
 */
public class LongestSubstring {


    public int lengthOfLongestSubstring(String s) {
        if (s == null || s == "")
            return 0;
        if (s.length() == 1)
            return 1;

        char[] ctrs = s.toCharArray();
        int result = 0;
        int temp = 0;
        Set<Character> set = new HashSet<>();
        int p1 = 0, p2 = 0;

        for (char ctr : ctrs) {
            if (!set.contains(ctr)) {
                temp++;
                set.add(ctr);
            } else {
                while (ctrs[p1] != ctr) {
                    set.remove(ctrs[p1]);
                    p1++;
                }
                p1++;
                temp = p2 - p1 + 1;
            }
            p2++;
            if (temp > result)
                result = temp;
        }

        return result;
    }

    public static void main(String[] args) {
        LongestSubstring substring = new LongestSubstring();
        System.out.println(substring.lengthOfLongestSubstring("tmmzuxt"));
    }
}