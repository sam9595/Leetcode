
public class PermutationSeq {
	public int factorial(int n){
		if(n < 0 )
			return -1;
		int sum = 1;
		while(n > 1){
			sum*=n--;	
		}
		return sum;
	}
	public StringBuilder CalPermute(int n, int k, StringBuilder sb){
		if(n == 1)
			return sb;
		int fac = factorial(n-1);
		if(n*fac <= k)
			return new StringBuilder();
		int rm = k / fac;
		char c = sb.charAt(rm);
		sb.deleteCharAt(rm);
		return CalPermute(n-1,k%fac,sb).insert(0, c);
	}
    public String getPermutation(int n, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	StringBuilder sb = new StringBuilder(n);
    	for(int i = 0 ; i < n ; i++){
    		sb.append(i+1);
    	}
    	StringBuilder sb2 = CalPermute(n,k - 1,sb); // k -1 for alignment
    	return sb2.toString();
    }
    public static void main(String args[]){
    	int n = 3;
    	StringBuilder sb = new StringBuilder(n);
    	for(int i = 0 ; i < n ; i++){
    		sb.append(i+1);
    		//sb.setCharAt(i, (char)('1'+ i));
    	}
    	sb.deleteCharAt(1);
    	PermutationSeq ps = new PermutationSeq();
    	String s = ps.getPermutation(3, 6);
    	System.out.println(s);
    	
    }
}
