import java.util.Arrays;


class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] filled = new int[10];
        for(int i = 0 ; i < 10 ; i ++)
        	filled[i] = 1;
    	//Row
    	for(int i = 0 ; i < 9 ; i++){
    		int[] check = Arrays.copyOf(filled, 10);
    		for(int j = 0 ; j < 9 ; j++){
    			if(board[i][j] == '.')
    				continue;
    			int a = Character.getNumericValue(board[i][j]);
    			check[a]--;
    			if(check[a] < 0)
    				return false;
    		}
    	}
    	//col
    	for(int i = 0 ; i < 9 ; i++){
    		int[] check = Arrays.copyOf(filled, 10);
    		for(int j = 0 ; j < 9 ; j++){
    			if(board[j][i] == '.')
    				continue;
    			int a = Character.getNumericValue(board[j][i]);
    			check[a]--;
    			if(check[a] < 0)
    				return false;
    		}
    	}
    	for(int i = 0 ; i < 3 ; i++){
    		for(int j = 0 ; j < 3 ; j++){
    			int[] check = Arrays.copyOf(filled, 10);
    			for(int ii = i * 3 ; ii < (i+1) * 3 ; ii++){
    				for(int jj = j * 3 ; jj < (j+1)*3 ;jj++){
    	    			if(board[ii][jj] == '.')
    	    				continue;
    	    			int a = Character.getNumericValue(board[ii][jj]);
    	    			check[a]--;
    	    			if(check[a] < 0)
    	    				return false;    					    					
    				}
    			}
    		}
    	}
    	return true;
    }
    public static void main(String args[]){
    	//char c[] = 'abc';
    	char board[][] = {"53..7....".toCharArray(),"6..195...".toCharArray(),".98....6.".toCharArray(),"8...6...3".toCharArray(),"4..8.3..1".toCharArray(),"7...2...6".toCharArray()
    			,".6....28.".toCharArray(),"...419..5".toCharArray(),"....8..79".toCharArray()};
    	ValidSudoku VS = new ValidSudoku();
    	System.out.println(VS.isValidSudoku(board));
    	
    	
    }
}
