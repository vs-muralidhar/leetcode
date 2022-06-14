class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character, Integer> sCharCount = new HashMap<>();
        for (int i=0; i<s.length();i++) {
            char c=s.charAt(i);
            int currCount = sCharCount.getOrDefault(c,0);
            currCount++;
            sCharCount.put(c, currCount);
        }
        for (Map.Entry<Character, Integer> currEntry : sCharCount.entrySet()) {
            System.out.println(currEntry.getKey() + "-" + currEntry.getValue());
        }
        
        for (int i=0; i<t.length();i++) {
            char tNow=t.charAt(i);
            int currCount = sCharCount.getOrDefault(tNow,-1);
            if (currCount <= 0) {
                return false; 
            } else {
                currCount--;
                sCharCount.put(tNow, currCount);
            }
        }
        
        for (Map.Entry<Character, Integer> currEntry : sCharCount.entrySet()) {
            System.out.println(currEntry.getKey() + "-" + currEntry.getValue());
        }
        return sCharCount.values().stream().filter(x -> x>0).count() > 0 ? false : true;
        
       
    }
}
