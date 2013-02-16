
public class RotateImage {
    public void rotate(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int n = matrix.length - 1;
    	int start = 0;
    	while(start < n){
    		int temp;
    		for(int j = 0 ; j < n -start ; j++){
    			temp = matrix[start][start + j];
    			matrix[start][start+j] = matrix[n - j][start];
    			matrix[n - j][start] = matrix[n][n-j];
    			matrix[n][n-j] = matrix[start+j][n];
    			matrix[start+j][n] = temp;
    		}
    		start++;
    		n--;
    	}
    }
    public static void main(String args[]){
    	int[][] m = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};	
    	RotateImage r = new RotateImage();
    	r.rotate(m);
    	for(int i = 0 ; i < m.length ; i++){
    		for(int j = 0 ; j < m[i].length ; j++){
    			System.out.print(m[i][j] + " ");
    		}
    		System.out.println();
    	}
    }
}
