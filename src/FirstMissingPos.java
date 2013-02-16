
public class FirstMissingPos {
	public int ShiftNonPositive(int[] A){
		int pos = A.length - 1;
		int temp;
		for(int i = 0 ; i <= pos ; i++){
			if(A[i] <= 0){
				temp = A[i];
				A[i] = A[pos];
				A[pos] = temp;
				pos --;
				i--;
			}
		}
		return pos;
	}
    public int firstMissingPositive(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int ValPos = ShiftNonPositive(A);
    	for(int i = 0 ; i <= ValPos ; i++){
    		int posi = Math.abs(A[i]);
    		if(posi -1  <= ValPos){
    			A[posi - 1] = -Math.abs(A[posi-1]);
    		}
    	}	
    	for(int i = 0 ; i <= ValPos ; i++){
    		if(A[i] > 0)
    			return i+1;
    	}
    	return ValPos + 2;
    }
    public static void main(String args[]){
    	FirstMissingPos fmp = new FirstMissingPos();
    	int A[] = {-3,3,-1,4,0,1,2,5,-5};
    	int a = fmp.firstMissingPositive(A);
    	System.out.println(a);
    }
}
