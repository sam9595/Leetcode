import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Anagram {
    public ArrayList<String> anagrams(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
    	ArrayList<String> rList = new ArrayList<String>();
    	for(String s : strs){
    		char[] c = s.toCharArray();
    		Arrays.sort(c);
    		String sortedStr = new String(c);
    		if(map.containsKey(sortedStr)){
    			map.get(sortedStr).add(s);
    		}
    		else{
    			ArrayList<String> aList = new ArrayList<String>();
    			aList.add(s);
    			map.put(sortedStr, aList);
    		}
    	}
    	for(Map.Entry<String, ArrayList<String>> En: map.entrySet()){
    		if(En.getValue().size() > 1){
    			rList.addAll(En.getValue());
    		}
    	}
    	return rList;
    }
    public static void main(String args[]){
    	Anagram a = new Anagram();
    	String[] s = {"abc","bac","cab","ccc","becd","dcbe"};
    	ArrayList<String> aList = a.anagrams(s);
    	System.out.println(aList);
    }
}
