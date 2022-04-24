public class RemoveDuplicatesfromSortedArray {

public int removeDuplicates(int[] nums) {
        
        // [0,0,1,1,1,2,2,3,3,4]
        //  0 1 2 3 4 5 6 7 8 9
        //      ^     ^
        //      i     j
        int i=0;
        for (int j=1; j<nums.length; j++) {
            if (nums[i] == nums[j]) continue;
            
            // if the values differ, bump i to the next position and assign it the new value
            i++;
            nums[i] = nums[j];
        }

        return i+1;
    }


}
