
public class RemoveDupSorted {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int curr_w = 0;
        int curr_r = 0;
        int len = 0;
        while(curr_r < A.length){
        	if(curr_r == 0 || A[curr_r] != A[curr_r-1]){
        		A[curr_w] = A[curr_r];
        		curr_w++;
        	}
        	curr_r++;
        }
        len = curr_w;
        while(curr_w < A.length){
        	A[curr_w] = 0;
        	curr_w++;
        }
        return len;
    }
}
