
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String comPre = "";
        if(strs.length == 0)
        	return comPre;
        for(int i = 0 ; i < strs[0].length(); i++){
        	char c = strs[0].charAt(i);
        	for(int j = 0 ; j < strs.length ; j++){
        		if(strs[j].length() <= i )
        			return comPre;
        		if(c != strs[j].charAt(i))
        			return comPre;
        	}
        	comPre = comPre + c;
        }
        return comPre;
    }
    public static void main(String args[]){
    	String[] a ={"a","abcd",""};
    	LongestCommonPrefix LCP = new LongestCommonPrefix();
    	String b = LCP.longestCommonPrefix(a);
    	System.out.println(b);
    }
}
