
public class ReMatch {
    public boolean isMatch(String s, String p) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	//System.out.println(s+ " " + p);
    	int s_idx = 0;
    	int p_idx = 0;
    	boolean ret = false;
    	while(p_idx < p.length() ){
    		if(p_idx+1 < p.length() && p.charAt(p_idx + 1) == '*'){
        		if(p.charAt(p_idx) == '.'){
        			if(p_idx == p.length() - 2)
        				return true;
        			else{
        				while(s_idx < s.length()){
        					if(s.charAt(s_idx)==p.charAt(p_idx+2)|| p.charAt(p_idx+2) == '.' || (p_idx < p.length() - 3 && p.charAt(p_idx+3) == '*')){
        						ret |= isMatch(s.substring(s_idx),p.substring(p_idx+2));
        						if(ret == true)
        							return true;
        					}
        					s_idx ++;
        				}
        			}
        		}
        		else{
        			while(s_idx < s.length()){
        				if(p_idx < p.length() - 2){
        					if(s.charAt(s_idx)==p.charAt(p_idx+2) || p.charAt(p_idx+2) == '.' || (p_idx < p.length() - 3 && p.charAt(p_idx+3) == '*')){
        						ret |= isMatch(s.substring(s_idx),p.substring(p_idx+2));
        						if(ret == true)
        							return true;
        					}
        				}
        				if(s.charAt(s_idx) != p.charAt(p_idx))
        					break;
        				s_idx++;
        			}
        		}
        		p_idx += 2;
        		continue;
    		}
    		else if(p.charAt(p_idx) == '.'){
    			if(s_idx >= s.length())
    				return false;
    			p_idx ++;
    			s_idx ++;
    		}
    		else{
    			if(s_idx >= s.length())
    				return false;    			
    			if(p.charAt(p_idx) != s.charAt(s_idx)){
    				return false;
    			}
    			else{
    				p_idx ++;
    				s_idx ++;
    			}
    		}
    	}
    	if(p_idx == p.length() && s_idx == s.length())
    		return true;
    	else
    		return false;
    }
    public static void main(String args[]){
    	ReMatch RM = new ReMatch();
    	boolean b =RM.isMatch("bcaccbbacbcbcab", "b*.c*..*.b*b*.*c*");
    	System.out.println(b);
    }
}
