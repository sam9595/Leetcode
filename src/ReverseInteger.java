
public class ReverseInteger {
    public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int base = 10;
    	int ret = 0;
    	while(x/base != 0){
    		base *= 10;
    	}
    	base /= 10;
    	
    	while(x != 0){
    		ret += (x % 10)*base;
    		x /= 10;
    		base /= 10;
    	}
    	
    	return ret;
    }
    public static void main(String args[]){
    	ReverseInteger a = new ReverseInteger();
    	int b = a.reverse(-12);
    	System.out.println(b);
    }
}
