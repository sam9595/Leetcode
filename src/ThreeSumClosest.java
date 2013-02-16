import java.util.Arrays;


public class ThreeSumClosest {
    public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	Arrays.sort(num);
    	if(num.length < 3)
    		return 0;
    	int closest = num[0] + num[1] + num[2];
    	for(int i = 0 ; i < num.length ; i++){
    		int left = 0;
    		int right = num.length - 1;
    		while(left < right){
    			if(left == i){
    				left++;
    				continue;
    			}
    			if(right == i){
    				right--;
    				continue;
    			}
    			int sum = num[i] + num[left] + num[right];
    			if( sum == target )
    				return target;
    			if( sum < target){
    				if(target - sum < Math.abs(target-closest))
    					closest = sum;
    				left++;
    				continue;
    			}
    			if( sum > target){
    				if(sum - target < Math.abs(target-closest))
    					closest = sum;
    				right--;
    				continue;
    			}
    			
    		}
    	}
    	return closest;
    }
    public static void main (String args[]){
    	ThreeSumClosest TSC = new ThreeSumClosest();
    	int num[] = {1,2,3,4,5,6,0};
    	int closest = TSC.threeSumClosest(num, 2);
    	System.out.println(closest);
    }
}
