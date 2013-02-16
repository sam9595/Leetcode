
public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	char[] str = s.toCharArray();
    	int len = 0;
    	for(int i = str.length - 1 ; i >= 0 ; i --){
    		if(str[i] == ' '){
    			if(len > 0)
    				return len;    			
    		}
    		else{
    			len++;
    		}
    	}
    	return len;
    }
    public static void main(String args[]){
    	LengthLastWord llw = new LengthLastWord();
    	System.out.println(llw.lengthOfLastWord("  "));
    }
}
