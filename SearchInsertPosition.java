// Problem Statement : https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {
      
    int pivot, left = 0, right = nums.length - 1;
    
    while (left <= right) {
      pivot = left + (right - left) / 2;
      if (nums[pivot] == target) return pivot;
      if (target < nums[pivot]) right = pivot - 1;
      else left = pivot + 1;
    }

    return left;
  }

	public static void main(String[] args) {
		int[] input = new int[]{1,3,5,6};
		int target = 4;
		System.out.println("Answer is : " + searchInsert(input, target)); 
	}

}
