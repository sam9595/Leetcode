
public class Atoi {
    public int atoi(String str) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int base = 1;
    	int ret = 0;
    	int sign = 1;
    	boolean start = false;
        for(int i = 0 ; i < str.length() ; i++){
        	char c = str.charAt(i);


        	if(c >= '0' && c <= '9'){
        		start = true;
        		if(sign == 1 && (Integer.MAX_VALUE - sign*(c - 48)) / 10 >= ret)
        			ret = ret*10 + sign*(c - 48);
        		else if(sign == -1 && (Integer.MIN_VALUE - sign*(c-48)) / 10 <= ret){
        			ret = ret*10 + sign*(c - 48);
        		}
        		else{
                	if(sign == -1)
                		return Integer.MIN_VALUE;
                	else
                		return Integer.MAX_VALUE;
        		}
        	}
        	else{
        		if(start)
        			break;
            	if(c == '+'){
            		start = true;
            		continue;
            	}   
            	if(c == '-'){
            		sign = -1;
            		start = true;
            		continue;
            	}
            	if(c == ' ')
            		continue;
            	else
            		break;
        	}
        }
        return ret;
    }
    public static void main(String args[]){
    	int a = -1021254602;
    	Atoi at = new Atoi();

    	int b = at.atoi("-123123214123213");
    	System.out.println(b);
    }
}
