// Problem Statement : https://leetcode.com/problems/longest-substring-without-repeating-characters/

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        // map to store the character and current index
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;

        for (int i = 0, j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                i = Math.max(i, map.get(ch) + 1); // +1 is because, we move i to the element next to the duplicate char
            }
            result = Math.max(result, j - i + 1); // +1 is because of 0-indexed
            map.put(ch, j);
        }

        return result;
    }
}


