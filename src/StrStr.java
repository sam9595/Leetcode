
public class StrStr {
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(needle.length() > haystack.length())
    		return null;
    	int diff = 0;
    	int len = needle.length();
    	String output = null;
    	while(diff + len <= haystack.length()){
    		boolean match = true;
    		int tempdiff = 0;
    		for(int i = len -1 ; i >= 0 ; i --){    	
    			if(match){
    				if(haystack.charAt(diff + i ) == needle.charAt(i)){    			
    				}
    				else
    					match = false;
    			}
    			else if(tempdiff > 0)
    				break;
    			
    			if(tempdiff == 0){
    				if(haystack.charAt(diff + len - 1 ) == needle.charAt(i)){
    					tempdiff = len - 1 - i;
    				}
    			}
    		}
    		if(match){
    			return haystack.substring(diff); 
    		}
    		else if(tempdiff > 0){
    			diff+=tempdiff;
    		}
    		else
    			diff+=len;
    	}
    	return output;
    }
    public static void main(String args[]){
    	StrStr s = new StrStr();
    	String a = s.strStr("abcc", "bcc");
    	//String a = s.strStr("baabbaaaaaaabbaaaaabbabbababaabbabbbbbabbabbbbbbabababaabbbbbaaabbbbabaababababbbaabbbbaaabbaababbbaabaabbabbaaaabababaaabbabbababbabbaaabbbbabbbbabbabbaabbbaa", "bbaaaababa");
    	System.out.println(a);
    }
}
