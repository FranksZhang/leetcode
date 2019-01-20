package com.zwf.Perfect;

/**
 * 11
 */
public class ContailnerWithMostWater {

    /**
     * O(N2)的做法
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
            int thisArea = 0;
            for (int j = 1; j < height.length; j++) {
                int hei = height[i] < height[j] ? height[i] : height[j];
                thisArea = hei * (j - i);
                if (thisArea > maxArea)
                    maxArea = thisArea;
            }
        }
        return maxArea;
    }

    /**
     * O(N)
     * @param height
     * @return
     */
    public int maxArea2(int[] height) {
        int i = 0, j = height.length - 1;
        int hei = height[i] < height[j] ? height[i] : height[j];

        int maxArea = hei * (j - i);
        for (;i < j;) {
            maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j])
                i++;
            else
                j--;
        }
        return maxArea;
    }
}
