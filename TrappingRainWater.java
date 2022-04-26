// problem statement : https://leetcode.com/problems/trapping-rain-water/
public class TrappingRainWater {

    public static int trap(int[] height) {
        if (height.length == 0) return 0;

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int ans = 0;
        while (left < right) {
            if (height[left] > leftMax) leftMax = height[left];
            if (height[right] > rightMax) rightMax = height[right];

            if (leftMax < rightMax) {
                ans = ans + Math.max(0, leftMax - height[left]);
                left++;
            } else {
                ans = ans + Math.max(0, rightMax - height[right]);
                right--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapped Rain Water is " + trap(height) + " units");
    }
}