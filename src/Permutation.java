import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;


public class Permutation {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(num.length == 0)
    		return null;
    	ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>();
    	if(num.length == 1){
    		ArrayList<Integer> b = new ArrayList<Integer>();
    		b.add(num[0]);
    		aList.add(b);
    		return aList;
    	}
    	int first = num[0];
    	ArrayList<ArrayList<Integer>> bList = permute(Arrays.copyOfRange(num,1, num.length));
    	for(ArrayList<Integer> b : bList){
    		for(int j = 0 ; j < b.size() + 1; j++){
    			ArrayList<Integer> c = new ArrayList<Integer>(b);
    			c.add(j,first);
    			aList.add(c);
    		}
    	}
    	HashSet<ArrayList<Integer>> h = new HashSet<ArrayList<Integer>>(aList);
    	
    	return new ArrayList<ArrayList<Integer>>(h);
    }    
	public static void main(String args[]){
		Permutation p = new Permutation();
		int[] A = {1,1,3};
		ArrayList<ArrayList<Integer>> list = p.permute(A);
		System.out.println(list);
	}
}
