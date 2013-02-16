
public class TrapWater {
    public int trap(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int[] leftmax = new int[A.length];
    	int[] rightmax = new int[A.length];
    	int max = 0;
    	int sum = 0;
    	for(int i = 0 ; i < A.length ;i++){
    		if(A[i] > max)
    			max = A[i];
    		leftmax[i] = max;
    	}
    	max = 0;
    	for(int i = A.length - 1 ; i >= 0 ; i--){
    		if(A[i] > max)
    			max = A[i];
    		rightmax[i] = max;
    	}
    	for(int i = 0 ; i < A.length ; i++){
    		int minmax = Math.min(leftmax[i], rightmax[i]);
    		sum += minmax - A[i];
    	}
        return sum;
    }
    public static void main(String args[]){
    	TrapWater tw = new TrapWater();
    	int A[] = {0,1,0,2,1,0,1,3,2,1,2,1};
    	int s =tw.trap(A);
    	System.out.println(s);
    }
}
