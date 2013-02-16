import java.util.Arrays;


public class NQueen2 {
	int count;
	public boolean check(int row, int idx, int n, int[] arry){
		for(int i = 0 ; i < row ; i++){			
			if(arry[i] == idx ||  (row - i) == Math.abs(arry[i] - idx))
				return false;
		}
		return true;
	}
	public void SNQueen2(int row, int n, int[] arry){
		
		if(row == n ){
			count++;
			return;
		}
	
		
		for(int k = 0 ; k < n ; k ++){
			if(check(row,k,n,arry)){				
				arry[row] = k;
				SNQueen2(row+1,n,arry);
			}		
		}
		return;
	}
	public int totalNQueens(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
		count = 0;
        int[] arry = new int[n];
        
        SNQueen2(0,n,arry);
        return count;
    }
    public static void main(String args[]){
    	NQueen2 N = new NQueen2();
    	int num = N.totalNQueens(8);
  
    	System.out.println(num);
    	
    }
}
