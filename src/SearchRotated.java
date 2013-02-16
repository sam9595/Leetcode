
public class SearchRotated {
    public int search(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int left = 0;
    	int right = A.length - 1;
    	while(left <= right){
    		int mid = (left + right) / 2;
    		if(A[left] == target){
    			return left;
    		}
    		if(A[right] == target){
    			return right;
    		}
    		if(A[mid] == target){
    			return mid;
    		}
    		if(A[left] > A[mid]){ //rotate
    			if(target >= A[left] || target < A[mid]){
    				right = mid - 1;
    				continue;
    			}
    			else{
    				left = mid + 1;
    				continue;
    			}
    		}
    		else{
    			if(target >= A[left] && target < A[mid]){
    				right = mid - 1;
    				continue;
    			}
    			else{
    				left = mid + 1;
    				continue;
    			}
    		}
    	}
    	return -1;
    }
    public static void main(String args[]){
    	SearchRotated Sr = new SearchRotated();
    	int[] A = {5,1,2,3,4};
    	System.out.println(Sr.search(A, 1));
    }
}
