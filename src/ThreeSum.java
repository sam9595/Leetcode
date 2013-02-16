import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;


public class ThreeSum {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	HashMap<Integer,Integer> HM = new HashMap<Integer,Integer>();
    	HashMap<ArrayList<Integer>,Integer> HMList = new HashMap<ArrayList<Integer>,Integer>();
    	ArrayList<ArrayList<Integer>> reList= new ArrayList<ArrayList<Integer>>();
    	for(int i = 0 ; i < num.length ; i ++){
    		if(HM.containsKey(num[i]))
    			HM.put(num[i], HM.get(num[i]) + 1);
    		else
    			HM.put(num[i], 1);
    	}
    	for(int i = 0 ; i < num.length ; i++){
    		HM.put(num[i], HM.get(num[i]) - 1);
    		int first = num[i];
    		for(int j = i + 1 ; j < num.length ; j++){
    			HM.put(num[j], HM.get(num[j]) - 1);
    			int second = num[j];
    			int third = 0 - first - second;
    			if(HM.containsKey(third) && HM.get(third) > 0){
    				ArrayList<Integer> b = new ArrayList<Integer>();
    				b.add(first);
    				b.add(second);
    				b.add(third);
    				Collections.sort(b);
    				HMList.put(b, 1);
    				
    			}
    			HM.put(num[j], HM.get(num[j]) + 1);
    		}
    		HM.put(num[i], HM.get(num[i]) + 1);
    	}
    	for(ArrayList<Integer> c : HMList.keySet()){
    		reList.add(c);
    	}
    	return reList;
    }
    public static void main(String args[]){
    	ThreeSum TS = new ThreeSum();
    	//int num[] = {-1,0,1,2,-1,-4};
    	int num[] = {-7,-5,5,-6,-2,1,7,3,-4,-2,-2,-4,-8,-1,8,8,-2,-7,3,2,-7,8,-3,-10,5,2,8,7,7};
    	ArrayList<ArrayList<Integer>> reList=TS.threeSum(num);
    	System.out.println(reList);
    }
}
