import java.util.ArrayList;


public class SpiralMatrixTwo {
    public int[][] generateMatrix(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function

    	int [][] mat = new int[n][n];
    	
    	int rowlen = n;
    	int collen = n;
    	collen --; //start at row = 0
    	int i = 0;
    	int j = -1;  //Start from (0,-1)
    	int dir = 1;
    	int count = 0;
    	while(true){
    		if(rowlen == 0)
    			break;
    		for(int c = 0 ; c < rowlen ; c++){
    			j += dir;
    			mat[i][j] = ++count;
    		}
    		rowlen--;
    		if(collen == 0)
    			break;
    		for(int c = 0 ; c < collen ; c++){
    			i += dir;
    			mat[i][j] = ++count;
    		}
    		collen--;
    		dir *= -1;
    	}
    	return mat;        
    }
    public static void main(String args[]){
    	SpiralMatrixTwo smt = new SpiralMatrixTwo();
    	int n = 0;
    	int [][] mat = smt.generateMatrix(n);
    	for(int i = 0 ; i < n ; i ++){
    		for(int j = 0 ; j < n ; j ++){
    			System.out.print(mat[i][j] + " ");
    		}
    		System.out.println();
    	}
    }
}
