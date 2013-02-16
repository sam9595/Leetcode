
public class Power {
    public double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if( n == 1)
    		return x;
    	if(n == 0)
    		return 1;
    	if(x == 1)
    		return x;
    	int posn = Math.abs(n);
    	double ret;
    	ret = pow(x,posn>>1);
    	ret *= ret;
    	if(posn%2==1)
    		ret*=x;
    	if(n < 0)
    		return 1.0 / ret;
    	return ret;
    }
    public static void main(String args[]){
    	Power p = new Power();
    	double d = p.pow(0.81706, -3);
    	System.out.println(d);
    }
}
