
public class SearchInsert {
    public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int left = 0;
    	int right = A.length - 1;
    	int mid;
    	if(A.length == 0)
    		return 0;
    	while(left <= right){
    		mid = (left + right) /2;    		
    		if(A[mid] == target)
    			return mid;
    		if(mid == 0 && A[mid] > target)
    			return 0;
    		if(mid == A.length - 1 && A[mid] < target)
    			return A.length;
    		if(A[mid] < target && A[mid+1] > target)
    			return mid+1;
    		if(A[mid] < target){
    			left = mid + 1;
    		}
    		else{
    			right = mid - 1;
    		}
    	}
    	return -1;
    }
    public static void main(String args[]){
    	SearchInsert SI = new SearchInsert();
    	int[] A = {};
    	System.out.println(SI.searchInsert(A, 1));
    }
}
