import java.util.HashMap;


public class RomanInt {
    public int romanToInt(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	HashMap<Character,Integer> RomanI = new HashMap<Character,Integer>();
    	RomanI.put('I', 1);
    	RomanI.put('V', 5);
    	RomanI.put('X', 10);
    	RomanI.put('L', 50);
    	RomanI.put('C', 100);
    	RomanI.put('D', 500);
    	RomanI.put('M', 1000);
    	int ret = 0;
    	for(int i = 0 ; i < s.length() ; i++){
    		if( i + 1 < s.length() && RomanI.get(Character.valueOf(s.charAt(i))) < RomanI.get(Character.valueOf(s.charAt(i+1))) ){
    			ret += ( RomanI.get(Character.valueOf(s.charAt(i+1))) - RomanI.get(Character.valueOf(s.charAt(i))));
    			i++;
    			continue;
    		}
    		else{
    			ret+= RomanI.get(Character.valueOf(s.charAt(i)));
    		}
    	}
    	return ret;
    }
    public static void main(String args[]){
    	RomanInt ri = new RomanInt();
    	int a = ri.romanToInt("MCMXCIX");
    	System.out.println(a);
    }
}
