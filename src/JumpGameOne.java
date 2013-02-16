import java.util.PriorityQueue;


public class JumpGameOne {
    public boolean canJump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int max = 0;
    	int i = 0;
    	while(i <= max){
    		if(i + A[i] > max)
    			max = i + A[i];
    		if(max >= A.length - 1)
    			return true;
    		i++;
    	}    	
    	return false;
    }
}
