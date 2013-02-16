
public class CountandSay {
    public String countAndSay(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	String read = "1";
    	n--;
    	while(n > 0){
    		String temp = "";
    		char last = read.charAt(0);
    		int count = 1;    	
    		for(int i = 1 ; i < read.length(); i++){
    			if(last == read.charAt(i)){
    				count++;
    			}
    			else{
    				temp = temp + Integer.toString(count) + read.charAt(i-1);
    				last = read.charAt(i);
    				count = 1;
    			}
    		}
    		temp = temp + Integer.toString(count) + read.charAt(read.length()-1);
    		n--;
    		read = temp;
    	}
    	return read;
    }
    public static void main(String args[]){
    	CountandSay CS = new CountandSay();
    	System.out.println(CS.countAndSay(5));
    }
}
