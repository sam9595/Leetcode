
public class SolveSudoku {
	public boolean checkValid(char[][] board, int node){
		int i = node / 9;
		int j = node % 9;
		int ii = i / 3;
		int jj = j / 3 ;
		for(int k = 0 ; k < 9 ;k++){
			if(k == j || board[i][k] == '.')
				continue;
			if(board[i][k] == board[i][j])
				return false;
		}
		for(int k = 0 ; k < 9 ;k++){
			if(k == i || board[k][j] == '.')
				continue;
			if(board[k][j] == board[i][j])
				return false;
		}		
		for(int k1 = ii*3 ; k1 < (ii+1)*3 ; k1++){
			for(int k2 = jj*3 ; k2 < (jj+1)*3 ; k2++){
				if((k1 == i && k2 == j) || board[k1][k2] == '.')
					continue;
				if(board[k1][k2] == board[i][j])
					return false;
			}
		}
		return true;
	}
	public boolean Sudoku(char[][] board, int n){
		if(n == 81)
			return true;
		int i = n / 9;
		int j = n % 9;
	
		if(board[i][j] != '.'){
			if(Sudoku(board,n+1))
				return true;
			else
				return false;
		}
		else{
			for(int k = 1 ; k < 10 ; k++){
				board[i][j] = (char)(k+48);
				if(checkValid(board,n)){
					if(Sudoku(board,n+1))
						return true;
				}
			}
			board[i][j] = '.';
		}
		return false;
	}
    public void solveSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	Sudoku(board,0);
    }
    public static void main(String args[]){
    	char board[][] = {"..9748...".toCharArray(),"7........".toCharArray(),".2.1.9...".toCharArray(),
    			"..7...24.".toCharArray(),".64.1.59.".toCharArray(),".98...3..".toCharArray(),"...8.3.2.".toCharArray(),"........6".toCharArray(),"...2759..".toCharArray()};
    	//char board[][] = {"53..7....".toCharArray(),"6..195...".toCharArray(),".98....6.".toCharArray(),"8...6...3".toCharArray(),"4..8.3..1".toCharArray(),"7...2...6".toCharArray()
    	//		,".6....28.".toCharArray(),"...419..5".toCharArray(),"....8..79".toCharArray()};
    	SolveSudoku S = new SolveSudoku();
    	S.solveSudoku(board);
    	System.out.println(board[0]);
    	System.out.println(board[1]);
    	System.out.println(board[2]);
    }
}
