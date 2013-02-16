
public class palindromeStr {
    public static boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s.length() == 0)
            return true;
        s = s.toLowerCase();
        int i,j;
        for(i = 0, j = s.length()-1 ; i < j ; i++,j--){
            while( (s.charAt(i) < 'a' || s.charAt(i) > 'z') && (s.charAt(i) < '0' || s.charAt(i) > '9') ){
                i++;
                if(i >= s.length())
                    break;
            }
            while((s.charAt(j) < 'a' || s.charAt(j) > 'z') && (s.charAt(j) < '0' || s.charAt(j) > '9')){
                j--;
                if(j < 0 )
                    break;
            }
            if(i >= j)
                break;
            if(s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
	public static void main(String args[]){
		isPalindrome(".,");
	}
}
