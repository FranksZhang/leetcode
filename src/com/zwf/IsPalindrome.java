package com.zwf;

/**
 * Created by wf on 2017/4/5.
 */
public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int p = 0;
        int temp = x;
        while(temp > 0) {
            p = p * 10 + temp % 10;
            temp /= 10;
        }
        return x == p;
    }
}
