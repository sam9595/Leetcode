
public class UniquePathII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int m = obstacleGrid.length;
    	int n = obstacleGrid[0].length;
    	int[][] PathSum = new int[m][n];
    	if(obstacleGrid[0][0] == 0)
    		PathSum[0][0] = 1; 
    	for(int j = 1 ; j < n ; j++){
    		if(obstacleGrid[0][j] == 0)
    			PathSum[0][j] = PathSum[0][j-1];
    		else
    			PathSum[0][j] = 0;
    	}
    	for(int i = 1 ; i < m ; i++){
    		if(obstacleGrid[i][0] == 0)
    			PathSum[i][0] = PathSum[i-1][0];
    		else
    			PathSum[i][0] = 0;
    	}
    	for(int i = 1 ; i < m ; i ++){
    		for(int j = 1; j < n ; j++){
    			if(obstacleGrid[i][j] == 0){
    				PathSum[i][j] = PathSum[i-1][j] + PathSum[i][j-1];
    			}
    			else
    				PathSum[i][j] = 0;
    		}
    	}
    	return PathSum[m-1][n-1];
    }
    public static void main(String args[]){
    	UniquePathII up = new UniquePathII();
    	int [][] a = {{0}};
    	int b = up.uniquePathsWithObstacles(a);
    	System.out.println(b);
    }
}
