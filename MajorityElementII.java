class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int length = nums.length;
        int div = length/3;
        /*if (div <= 0) {
            return Arrays.stream(nums).boxed().collect(Collectors.toList());
        }*/
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap<>();
        for (int i=0;i<length;i++) {
            int val = nums[i];
            int newCount = count.getOrDefault(val, 0) + 1;
            count.put(val, newCount);
        }
        return count.entrySet().stream().filter(x -> x.getValue() > div).map(Map.Entry::getKey).collect(Collectors.toList());
        
    }
}
