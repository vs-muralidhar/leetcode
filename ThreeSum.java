//Problem Statement : https://leetcode.com/problems/3sum/

public Class ThreeSum {

public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums); // [-4,-2,-1,0,5,6]
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            if (i==0 || nums[i] != nums[i-1]) {
                twoSumII(i, nums, res);
            }
        }
        return res;
    }
    
    
    public void twoSumII(int i, int[] nums, List<List<Integer>> res) {
        int lo=i+1, hi=nums.length-1;
        while (lo<hi) {
            int sum=nums[i]+nums[lo]+nums[hi];
            if (sum < 0) {
                lo++;
            } else if (sum>0) {
                hi--;
            } else {
                res.add(List.of(nums[i],nums[lo],nums[hi]));
                lo++;
                hi--;
                
                while(lo<hi && nums[lo]==nums[lo-1])
                    lo++;
            }
        }
    }

}

