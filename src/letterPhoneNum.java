import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class letterPhoneNum {
	public HashMap<Integer,ArrayList<Character>> digitNum;
	public ArrayList<String> letterCombine(String digits, int idx){
		ArrayList<String> sList = new ArrayList<String>();
		if(digits.length() <= idx){	
			sList.add(digits);
			return sList;
		}
		StringBuilder SB = new StringBuilder(digits);
		Character c = digits.charAt(idx);
		int num = Character.getNumericValue(c);
		if(digitNum.containsKey(num)){
			for(Character cc : digitNum.get(new Integer(num))){
				SB.setCharAt(idx, cc);
				sList.addAll(letterCombine(SB.toString(),idx+1));
			}
		}
		else{
			return letterCombine(digits,idx+1);
		}
		return sList;
	}
    public ArrayList<String> letterCombinations(String digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	digitNum = new HashMap<Integer,ArrayList<Character>>();
    	digitNum.put(2, new ArrayList<Character>(Arrays.asList('a','b','c')));
    	digitNum.put(3, new ArrayList<Character>(Arrays.asList('d','e','f')));
    	digitNum.put(4, new ArrayList<Character>(Arrays.asList('g','h','i')));
    	digitNum.put(5, new ArrayList<Character>(Arrays.asList('j','k','l')));
    	digitNum.put(6, new ArrayList<Character>(Arrays.asList('m','n','o')));
    	digitNum.put(7, new ArrayList<Character>(Arrays.asList('p','q','r','s')));
    	digitNum.put(8, new ArrayList<Character>(Arrays.asList('t','u','v')));
    	digitNum.put(9, new ArrayList<Character>(Arrays.asList('w','x','y','z')));
    	return letterCombine(digits,0);
    }
    public static void main(String args[]){
    	letterPhoneNum a = new letterPhoneNum();
    	System.out.println(a.letterCombinations("89"));
    }
}
