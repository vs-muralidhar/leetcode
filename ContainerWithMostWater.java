// Problem Statement : https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, maxArea = 0;

        while (l < r) {
            maxArea = Math.max(maxArea, (Math.min(height[l], height[r]) * (r - l)));

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}