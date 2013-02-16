
public class LongValidParen {
    public int longestValidParentheses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int a[] = new int[s.length()];
    	int last = -1;
    	int max = 0;
    	for(int i = 0 ; i < s.length() ; i++){
    		if(s.charAt(i) == '('){
    			a[i] = last;
    			last = i;
    		}
    		else{
    			a[i] = last;
    			if(last != -1){
    				int len = i - last + 1;
    				int temp = last - 1;
    				while(temp >= 0 && s.charAt(temp) == ')' && a[temp] >=0){
    					len += temp - a[temp] + 1;
    					temp = a[temp]-1;
    				}
    				if(len> max){    					
    					max = len;
    				}
    			}
    			if(last >= 0)
    				last = a[last];
    			else
    				last = -1;
    		}
    	}

    	return max;
    }
    public static void main(String args[]){
    	LongValidParen p = new LongValidParen();
    	int a = p.longestValidParentheses(")()()(())()");
    	System.out.print(a);
    }
}
