public class ValidPalindrome {

	public boolean isPalindrome(String a) {
        int l = 0, r = a.length()-1;
        while(l < r)
        {
            if(!isGoodChar(a.charAt(l)))l++;
            else if(!isGoodChar(a.charAt(r)))r--;
            else
            {
                if(Character.toLowerCase(a.charAt(l))!=Character.toLowerCase(a.charAt(r)))return false;
                l++;
                r--;
            }
        }
        return true;
    }
    
    public boolean isGoodChar(char c)
    {
        return Character.isLetterOrDigit(c);
    }

}
