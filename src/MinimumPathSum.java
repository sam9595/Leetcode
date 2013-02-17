
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        // Start typing your Java solution below
        // DO NOT write main() function    	
    	int m = grid.length;
    	int n = grid[0].length;
    	int[][] sumPath = new int[m][n];
    	sumPath[0][0] = grid[0][0];
    	for(int j = 1 ; j < n ; j++){
    		sumPath[0][j] = sumPath[0][j-1] + grid[0][j];
    	}
    	for(int i = 1 ; i < m ; i++){
    		sumPath[i][0] = sumPath[i-1][0] + grid[i][0];
    	}
    	for(int i = 1 ; i < m ; i++){
    		for(int j = 1 ; j < n ; j++){
    			if(sumPath[i-1][j] < sumPath[i][j-1])
    				sumPath[i][j] = sumPath[i-1][j] + grid[i][j];
    			else
    				sumPath[i][j] = sumPath[i][j-1] + grid[i][j];
    		}
    	}
    	return sumPath[m-1][n-1];
    }
}
