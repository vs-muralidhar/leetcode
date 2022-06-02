class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqElems = new HashSet<>();
        for (int num : nums) {
            if (uniqElems.contains(num)) {
                return true;
            }
            uniqElems.add(num);
        }
        
        return false;
    }
}
