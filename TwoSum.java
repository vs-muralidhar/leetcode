class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numIndex = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int compliment = target - nums[i];
            if (numIndex.containsKey(compliment)) {
                int result1 = numIndex.get(compliment);
                int result2 = i;
                return new int[]{result1, result2};
            }
            numIndex.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}