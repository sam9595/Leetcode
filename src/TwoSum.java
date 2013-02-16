import java.util.HashMap;


public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	HashMap<Integer,Integer> HM = new HashMap<Integer,Integer>();
    	for(int i = 0 ; i < numbers.length ; i++){
    		HM.put(numbers[i], i);
    	}
    	for(int i = 0 ; i < numbers.length ; i++){
    		if(HM.containsKey(target-numbers[i])){
    			int[] a = new int[2];
    			a[0] = i;
    			a[1] = HM.get(target-numbers[i]);
    			return a;
    		}
    	}
    	return null;
    }
    public static void main(String args[]){
    	TwoSum t = new TwoSum();
    	int[] num = {2,7,11,15};
    	int[] a = t.twoSum(num, 13);
    	for(int b : a)
    		System.out.println(b);
    }
}
