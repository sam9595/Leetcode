import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;


public class CombineSum {
		HashSet<ArrayList<Integer>> SumList;
		public void RecursiveSet(int[] candidates, int idx, int target, ArrayList<Integer> list){
			//System.out.println(target + " " + list);
			if(target == 0){
				Collections.sort(list);
				SumList.add(new ArrayList<Integer>(list));
				return;
			}
			for(int i = idx ; i >= 0 ;i--){
				if(candidates[i] <= target){
					list.add(candidates[i]);
					RecursiveSet(candidates,i,target-candidates[i],list);
					list.remove(new Integer(candidates[i]));
				}
			}
			
		}
	    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        SumList = new HashSet<ArrayList<Integer>>();
	        Arrays.sort(candidates);
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        ArrayList<ArrayList<Integer>> Clist = new ArrayList<ArrayList<Integer>>();
	        for(int i = candidates.length - 1; i >=0 ;i--){
	        	if(candidates[i] <= target){
	        		list.add(candidates[i]);
	        		RecursiveSet(candidates,i,target - candidates[i],list);
	        		list.remove(new Integer(candidates[i]));
	        	}
	        }
	        Clist.addAll(SumList);
	        return Clist;
	    }
	    public static void main(String args[]){
	    	CombineSum cs = new CombineSum();
	    	int[] c = {2,3,7};
	    	ArrayList<ArrayList<Integer>> a = cs.combinationSum(c, 18);
	    	System.out.println(a);
	    }
}
