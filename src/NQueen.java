import java.util.ArrayList;
import java.util.Arrays;


public class NQueen {
	ArrayList<String[]> sList;
	public boolean checkdiag(int idx, int n, String[] str){
		int i = idx / n;
		int j = idx % n;
		for(int k = 0 ; k < i ; k++){
			int c1 = j - (i - k) ;
			int c2 = j + (i - k) ;
			if(c1 >= 0 && str[k].charAt(c1) == 'Q')
				return false;
			if(c2 < n && str[k].charAt(c2) == 'Q')
				return false;
		}
		return true;
	}
	public boolean checkcol(int idx, int n, String[] str){
		int i = idx / n;
		int j = idx % n;
		for(int k = 0 ; k < i ; k++){
			if(str[k].charAt(j) == 'Q')
				return false;
		}
		return true;
	}
	public boolean checkrow(int idx, int n, String[] str){
		int i = idx / n;
		int j = idx % n;
		if(idx >= n*n)
			System.out.println(idx);
		for(int k = 0 ; k < j ;k++){
			if(str[i].charAt(k) == 'Q')
				return false;
		}
		return true;
	}
	public void SNQueen(int idx, int n, String[] str){

/*
    		for(int i = 0 ; i < str.length ; i++){
    			System.out.println(str[i]);
    		}
    		System.out.println();
*/
		
		if(idx >= n*n ){
			sList.add(Arrays.copyOf(str,str.length));
			return;
		}
	
		
		int i = idx / n;
		for(int k = 0 ; k < n ; k ++){
			if(checkrow(idx + k,n,str) && checkcol(idx + k,n,str) && checkdiag(idx + k,n,str)){
				str[i] = str[i].substring(0, k) + "Q" + str[i].substring(k+1,n);
				if(i >= n-1)
					SNQueen(n*n,n,str);
				else
					SNQueen((i+1)*n,n,str);
				str[i] = str[i].substring(0, k) + "." + str[i].substring(k+1,n);
			}
		}
		return;
	}
    public ArrayList<String[]> solveNQueens(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	sList = new ArrayList<String[]>();
        String[] str = new String[n];
    	char[] a = new char[n];
    	Arrays.fill(a, '.');    
        for(int i = 0 ; i < n ;i++){
        	str[i] = new String(a);
        }
        
        SNQueen(0,n,str);
        return sList;
    }
    public static void main(String args[]){
    	NQueen N = new NQueen();
    	ArrayList<String[]> aList = N.solveNQueens(8);
    	for(String[] strs : aList){
    		for(int i = 0 ; i < strs.length ; i++){
    			System.out.println(strs[i]);
    		}
    		System.out.println();
    	}
    	System.out.println();
    	
    }
}
