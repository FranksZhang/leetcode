package com.zwf.bitManipulation;

/**
 * Created by wf on 2017/4/1.
 */
public class SumOfTwoInteger {
    public int getSum(int a, int b) {
        int sum = 0;
        while(b != 0) {
            sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return a;
    }
}
