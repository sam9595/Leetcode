
public class UniquePath {
    public int uniquePaths(int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[][] pathSum = new int[m][n];
        for(int j = 0 ; j < n ; j++){
        	pathSum[0][j] = 1;
        }
        for(int i = 0 ; i < m ; i++){
        	pathSum[i][0] = 1;
        }
        for(int i = 1 ; i < m ; i++){
        	for(int j = 1 ; j < n ; j++){
        		pathSum[i][j] = pathSum[i-1][j] + pathSum[i][j-1];
        	}
        }
        return pathSum[m-1][n-1];
    }
}
