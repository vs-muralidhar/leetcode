class Solution {
    public String reverseWords(String str) {
        String[] s = str.trim().split(" ");
        
        int leftIndex =0, rightIndex=s.length-1;
        
        while (leftIndex < rightIndex) {
            
            String temp = s[rightIndex];
            s[rightIndex] = s[leftIndex];
            s[leftIndex] = temp;
            
            leftIndex++;
            rightIndex--;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length;i++) {
            
            if (!s[i].isEmpty())
                sb.append(s[i].trim()).append(" ");
        }
        return sb.toString().trim();
    }
}
