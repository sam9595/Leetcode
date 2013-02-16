
public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int curr_w = 0;
        int curr_r = 0;
        while(curr_r < A.length){
        	if(A[curr_r] != elem){
        		A[curr_w] = A[curr_r];
        		curr_w++;
        	}
        	curr_r++;
        }
        return curr_w;
    }
}
