
public class SearchRange {
	public int searchLeft(int[] A, int left, int right, int target){
		int mid = right;
		while(left <= right){
			mid = (left + right) / 2;
			if(A[mid] == target && (mid == 0 || A[mid - 1]!=target) ){
				return mid;
			}
			if(A[mid] < target){
				left = mid + 1;
			}
			else{
				right = mid - 1;
			}
		}
		return mid;
	}
	public int searchRight(int[] A, int left, int right, int target){
		int mid=left;
		while(left <= right){
			mid = (left + right) / 2;
			if(A[mid] == target && (mid == A.length-1 || A[mid + 1]!=target) ){
				return mid;
			}
			if(A[mid] <= target){
				left = mid + 1;
			}
			else{
				right = mid - 1;
			}
		}
		return mid;
	}	
    public int[] searchRange(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int left = 0 ;
        int right = A.length - 1;
        int mid;
        int[] lr = new int[2];
        while(left <= right){
        	mid = (left + right) /2 ;
        	if(A[mid] == target){
        		lr[0] = searchLeft(A,left,mid,target);
        		lr[1] = searchRight(A,mid,right,target);
        		return lr;
        	}
        	else if (A[mid] < target){
        		left = mid + 1;
        	}
        	else{
        		right = mid - 1;
        	}
        }
        lr[0] = -1;
        lr[1] = -1;
        return lr;
    }
    public static void main(String args[]){
    	SearchRange sr = new SearchRange();
    	int[] A = {8,8};
    	int [] B = sr.searchRange(A, 8);
    	System.out.println(B[0] + " " + B[1]);
    }
}
