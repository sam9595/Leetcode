import java.util.ArrayList;
import java.util.HashMap;


public class FindConCatString {
    public ArrayList<Integer> findSubstring(String S, String[] L) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashMap<String,Integer> HM = new HashMap<String,Integer>();
        ArrayList<Integer> reList = new ArrayList<Integer>();  
        int len = L[0].length();
        int num = L.length;
        for(String s : L){
        	if(HM.containsKey(s))
        		HM.put(s,HM.get(s) + 1);
        	else
        		HM.put(s, 1);
        }
        for(int i = 0 ; i < S.length() - len*num + 1; i++){
        	HashMap<String,Integer> temp = new HashMap<String,Integer>(HM);
        	for(int j = 0 ; j < num ; j++){
        		String a = S.substring(i + j*len, i + (j+1)*len);
        		if(temp.containsKey(a)){
        			if(temp.get(a) == 1)
        				temp.remove(a);
        			else
        				temp.put(a, temp.get(a) - 1);
        		}
        		else{
        			break;
        		}
        	}
        	if(temp.size() == 0){
        		reList.add(i);
        	}
        }
        return reList;
    }
    public static void main(String args[]){
    	FindConCatString f = new FindConCatString();
    	String[] s = {"foo","bar"};
    	ArrayList a = f.findSubstring("barfoobarthefoobarman", s);
    	System.out.println(a);
    	
    }
}
