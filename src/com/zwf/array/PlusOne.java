package com.zwf.array;

/**
 * 66
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {

        int length = digits.length;
        int[] result = new int[length + 1];
        int plus = 1;
        for (int i = length; i > 0; i--) {
            int temp = result[i] + digits[i - 1] + plus;
            plus = 0;
            if (temp >= 10) {
                result[i] = temp % 10;
                plus = 1;
            } else {
                result[i] = temp;
            }
        }
        if (plus == 1)
            result[0] = 1;
        int[] subResult;
        if (result[0] == 0) {
            subResult = new int[length];
            for (int i = 0; i < length; i++)
                subResult[i] = result[i + 1];
            return subResult;
        }
        return result;
    }
}
