package com.zwf;

public class ReverseInteger {

    /**
     * 需要注意int溢出问题
     *
     * @param x
     * @return
     */
    public int reverse(int x) {
        long[] temp = new long[32];
        int i = 0;
        boolean negative = false;
        if (x < 0) {
            x = -x;
            negative = true;
        }
        for (; x > 0; i++) {
            long num = x % 10;
            temp[i] = num;
            x = x / 10;
        }
        long tempresult = 0;
        for (int j = 0; j < i; j++) {
            tempresult = tempresult * 10 + temp[j];
        }

        if (tempresult > Integer.MAX_VALUE)
            return 0;
        else {
            int result = (int) tempresult;
            return negative ? -result : result;
        }
    }
}
