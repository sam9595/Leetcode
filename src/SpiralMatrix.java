import java.util.ArrayList;


public class SpiralMatrix {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	ArrayList<Integer> aList = new ArrayList<Integer>();
    	if(matrix.length == 0)
    		return aList;
    	int rowlen = matrix[0].length;
    	int collen = matrix.length;
    	collen --; //start at row = 0
    	int i = 0;
    	int j = -1;  //Start from (0,-1)
    	int dir = 1;

    	while(true){
    		if(rowlen == 0)
    			break;
    		for(int c = 0 ; c < rowlen ; c++){
    			j += dir;
    			aList.add(matrix[i][j]);
    		}
    		rowlen--;
    		if(collen == 0)
    			break;
    		for(int c = 0 ; c < collen ; c++){
    			i += dir;
    			aList.add(matrix[i][j]);
    		}
    		collen--;
    		dir *= -1;
    	}
    	return aList;
    }
    public static void main(String args[]){
    	SpiralMatrix sm = new SpiralMatrix();
    	int A[][] = {{1,2,3},{4,5,6},{7,8,9}};
    	ArrayList<Integer> sa = sm.spiralOrder(A);
    	System.out.println(sa);
    	
    }
}
