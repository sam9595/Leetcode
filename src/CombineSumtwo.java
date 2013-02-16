import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;


public class CombineSumtwo {
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
				RecursiveSet(candidates,i-1,target-candidates[i],list);
				list.remove(new Integer(candidates[i]));
			}
		}
		
	}
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        SumList = new HashSet<ArrayList<Integer>>();
        Arrays.sort(num);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> Clist = new ArrayList<ArrayList<Integer>>();
        for(int i = num.length - 1; i >=0 ;i--){
        	if(num[i] <= target){
        		list.add(num[i]);
        		RecursiveSet(num,i-1,target - num[i],list);
        		list.remove(new Integer(num[i]));
        	}
        }
        Clist.addAll(SumList);
        return Clist;
    }
    public static void main(String args[]){
    	CombineSumtwo cs = new CombineSumtwo();
    	int[] c = {10,1,2,7,6,1,5};
    	ArrayList<ArrayList<Integer>> a = cs.combinationSum2(c, 8);
    	System.out.println(a);
    }
}
