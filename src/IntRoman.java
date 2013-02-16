
public class IntRoman {
    public String intToRoman(int num) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int[] digit = new int[4];
    	char[] ten={'I','X','C','M'};
    	char[] five = {'V','L','D',' '};
    	int base = 10;
    	int i=0;
    	String numRom= "";
    	while(num > 0){
    		digit[i] = num % base;
    		num /= 10;
    		i ++;
    		
    	}
    	for(i = 3 ; i >= 0 ; i --){
    		if(digit[i]%5==4){
    			numRom = numRom + ten[i];
    		}
    		if(digit[i] <= 8 && digit[i] >= 4){
    			numRom = numRom + five[i];
    		}
    		if(digit[i] == 9){
    			numRom = numRom + ten[i+1];
    		}
    		int fiverm = digit[i] % 5;
    		if(fiverm < 4){
    			for(int j = 0 ; j < fiverm ; j++){
    				numRom = numRom + ten[i];
    			}
    		}
    		
    	}
    	return numRom;
    }
    public static void main(String args[]){
    	IntRoman a = new IntRoman();
    	for(int i = 300 ; i < 1000 ; i+=99){
    		String b = a.intToRoman(i);    	
    		System.out.println(i + " " + b);
    	}
    }
}
