
public class ZigZagString {
    public String convert(String s, int nRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	String output = "";
    	if(nRows == 1)
    		return s;
    	int l_val = 2*(nRows-1);
    	int r_val = 0;
    	for(int i = 0 ; i < nRows ; i++){
    		int j = i;
    		if(j < s.length())
    			output = output + s.charAt(j);
    		while(j < s.length()){
    			if(l_val > 0 ){
    				j += l_val;
    				if(j >= s.length()){
    					break;
    				}
    				output = output + s.charAt(j);

    			}
    			if(r_val > 0){
    				j += r_val;
    				if( j >= s.length()){
    					break;
    				}
    				output = output + s.charAt(j);
    			}
    		}
    		l_val -= 2;
    		r_val += 2;
    	}
    	return output;
    }
    public static void main(String args[]){
    	ZigZagString z = new ZigZagString();
    	String a = z.convert("ABC",1);
    	System.out.println(a);
    }

}
