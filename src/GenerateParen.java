import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class GenerateParen {
	public boolean extendable(String b, int n){
		for(int i = 0 ; i < b.length(); i++){
			if(b.charAt(i)=='(')
				n--;
		}
		if(n > 0)
			return true;
		return false;
	}
	public boolean contractable(String b){
		int paren = 0;
		for(int i = 0 ; i < b.length(); i++){
			if(b.charAt(i)=='(')
				paren++;
			else
				paren--;
		}
		if(paren>0)
			return true;
		return false;
	}
    public ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function	
    	LinkedList<String> q = new LinkedList<String>();
    	ArrayList<String> reList = new ArrayList<String>();
    	q.add(new String(""));
    	for(int i = 0 ; i < 2*n ; i++){
    		while(q.peek().length() < i + 1){
    			String b = q.poll();
    			if(extendable(b,n)){
    				q.add(new String(b+"("));
    			}
    			if(contractable(b)){
    				q.add(new String(b+")"));
    			}
    		}
    	}
    	reList.addAll(q);
    	return reList;
    }
    public static void main(String args[]){
    	GenerateParen p = new GenerateParen();
    	System.out.println(p.generateParenthesis(3));
    }
}
