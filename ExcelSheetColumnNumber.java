class Solution {
    public int titleToNumber(String columnTitle) {
        
        int result = 0;
        for (int i=0; i<columnTitle.length(); i++) {
            result = result*26 + columnTitle.charAt(i) - 'A' + 1;
        }
        return result;
    }
}

// For a title "LEET":

// L = (0 x 26) + 12
// E = (12 x 26) + 5 = 317
// E = (317 x 26) + 5 = 8247
// T = (8247 x 26) + 20 = 214442
