
public class JumpGame {
    public int jump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(A.length == 0 || A.length == 1)
    		return 0;
    	int[] step = new int[A.length];
    	step[A.length-1] = 0;
    	for(int i = A.length - 2 ; i >= 0 ; i --){

    		int minstep = A.length;
    		for(int j = 1 ; j <= A[i] && (i + j) <= A.length - 1 ; j++){
    			if(i+j == A.length - 1){
    				minstep = 0;
    				break;
    			}
    			if(i!= A.length - 2 && A[i] - A[i+j] == j){
    				if(step[i+j] - 1 < minstep){
    					minstep = step[i+j] - 1;
    					break;
    				}
    			}
    			if(step[i+j] < minstep)
    				minstep = step[i+j];
    		}
    		step[i] = minstep + 1;
    	}
    	return step[0];
    }
    public static void main(String args[]){
    	JumpGame jg = new JumpGame();
    	int A[] = {3,3,4,1};
    	int a = jg.jump(A);
    	System.out.println(a);
    }
}
