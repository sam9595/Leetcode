import java.util.Stack;


public class ValidParentheses {
    public boolean isValid(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	Stack<Character> st = new Stack<Character>();
    	for(int i = 0 ; i < s.length() ; i++){
    		if(s.charAt(i) == '('){
    			st.push(s.charAt(i));
    		}
    		else if(s.charAt(i) == '['){
    			st.push(s.charAt(i));
    		}
    		else if(s.charAt(i) == '{'){
    			st.push(s.charAt(i));
    		}
    		else if(s.charAt(i) == ')'){
    			if(st.size() <= 0 || st.peek() != '(' )
    				return false;
    			else
    				st.pop();
    		}
    		else if(s.charAt(i) == ']'){
    			if(st.size() <= 0 || st.peek() != '[' )
    				return false;
    			else
    				st.pop();
    		}
    		else if(s.charAt(i) == '}'){
    			if(st.size() <= 0 || st.peek() != '{' )
    				return false;
    			else
    				st.pop();			
    		}    		
    	}
    	if(st.size() == 0)
    		return true;
    	return false;
    }
    public static void main(String args[]){
    	ValidParentheses v = new ValidParentheses();
    	boolean b = v.isValid("");
    	System.out.println(b);
    }
}
