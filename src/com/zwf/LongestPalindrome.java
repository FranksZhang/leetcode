package com.zwf;

/**
 * Created by wf on 2017/4/10.
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        char[] ctr = s.toCharArray();
        int begin = 0, max = 1;
        boolean[][] flag = new boolean[1000][1000];
        for(int i = 0; i < s.length(); i++)
            flag[i][i] = true;
        for(int i = 0; i < s.length()-1; i++)
            if(ctr[i] == ctr[i+1]) {
                flag[i][i+1] = true;
                begin = i;
                max = 2;
            }

        for(int len = 3; len <= s.length(); len++) {
            for(int i = 0; i < s.length()-len+1; i++) {
                int j = i + len - 1;
                if(ctr[i] == ctr[j] && flag[i+1][j-1]) {
                    flag[i][j] = true;
                    begin = i;
                    max = len;
                }
            }
        }
        return s.substring(begin, begin + max);
    }

    public static void main(String[] args) {
        LongestPalindrome l = new LongestPalindrome();
        System.out.println(l.longestPalindrome("ccc"));
    }
}
