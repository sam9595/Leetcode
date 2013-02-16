import java.util.HashMap;


public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	HashMap<Character,Integer> HM = new HashMap<Character,Integer>();
    	int start = 0;
    	int maxlen = 0;
    	for(int i = 0 ; i < s.length(); i++){
    		Character c = Character.valueOf(s.charAt(i));
    		if(HM.containsKey(c)){
    			int ind = HM.get(c);
    			if(ind < start){
    				HM.put(c, i);
    			}
    			else{
    				if(i - start > maxlen){
    					maxlen = i - start;
    				}
    				start = HM.get(c) + 1;
    				HM.put(c, i);
    			}
    		}
    		else{
    			HM.put(Character.valueOf(s.charAt(i)), i);
    		}
    	}
    	if(s.length() - start > maxlen)
    		maxlen = s.length() - start;
    	return maxlen;
    }
    public static void main(String args[]){
    	LongestSubString ls = new LongestSubString();
    	int a = ls.lengthOfLongestSubstring("abcabcbb");
    	System.out.println(a);
    }
}
