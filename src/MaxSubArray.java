
public class MaxSubArray {
    public int maxSubArray(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(A.length == 0)
    		return 0;
    	int globalmax = A[0];
    	int localmax = A[0];
    	int sum = 0;
    	for(int i = 0 ; i < A.length ; i++){
    		sum+=A[i];
    		
    		if(sum > localmax){
    			localmax = sum;
    		}
    		if(sum < 0){
    			if(localmax > globalmax)
    				globalmax = localmax;
    			if(i != A.length - 1)
    				localmax = A[i+1];
    			sum = 0;
    		}
    	}
    	if(localmax > globalmax)
    		globalmax = localmax;
    	return globalmax;
    }
    public static void maxIndex(int a[]){
        if(a==null || a.length==0)return;
        int start=0, end = 0, tempStart = 0, max =a[0], sum = a[0];
        for(int i =1;i<a.length;i++){
            sum +=a[i];
            if(sum<0){
                sum = 0;
                tempStart = i+1;
            }
            else if(sum>max){
                max = sum;
                start = tempStart;
                end = i;
            }
        }
        System.out.println("start " + start + " end " + end);
    }    
    public static void main(String args[]){
    	MaxSubArray msa = new MaxSubArray();
    	int A[] = {-2,1,-3,4,-1,2,1,-5,4};
    	int B[] = {1,-1,2};
    	int a = msa.maxSubArray(A);
    	System.out.println(a);
    	MaxSubArray.maxIndex(B);
    }
}
