class Solution {
public int[] twoSum(int[] nums, int target) {

    int leftIndex = 0, rightIndex = nums.length - 1;
    
    while (leftIndex < rightIndex) {
        int currVal = nums[leftIndex]; 
        int compliment = target - currVal; 
        
        if (compliment == nums[rightIndex]) {
            return new int[]{leftIndex+1, rightIndex+1};
        } else if (nums[rightIndex] > compliment ) {
            rightIndex--;
        } else {
            leftIndex++;
        }
    }
    return null;
}
}
