import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


public class FourSum {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	Arrays.sort(num);
    	ArrayList<ArrayList<Integer>> reList = new ArrayList<ArrayList<Integer>>();
    	HashSet<ArrayList<Integer>> reSet = new HashSet<ArrayList<Integer>>();    	
    	if(num.length < 4)
    		return reList;

    	for(int i = 0 ; i < num.length - 1 ; i++){
    		for(int j = i+1 ; j < num.length ; j++ ){
    			int left = 0;
    			int right = num.length - 1;
    			while(left < right){
    				if(left == i || left == j){
    					left++;
    					continue;
    				}
    				if(right == i || right == j){
    					right --;
    					continue;
    				}
    				int sum = num[i] + num[j] + num[left] + num[right];
    				if(sum == target){
    					ArrayList<Integer> a = new ArrayList<Integer>();
    					a.addAll(Arrays.asList(num[i],num[j],num[left],num[right]));
    					Collections.sort(a);
    					reSet.add(a);
    					left++;
    					right--;
    					continue;
    				}
    				else if(sum < target){
    					left++;
    					continue;
    				}
    				else{
    					right--;
    					continue;
    				}
    			}
    		}
    	}
		reList.addAll(reSet);
		return reList;
    }
    public static void main(String args[]){
    	FourSum FS = new FourSum();
    	int num[] = {1,2,3,4,5,6,0};
    	System.out.println(FS.fourSum(num, 10));
    }
}
