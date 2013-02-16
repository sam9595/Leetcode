
public class MultiplyStr {
    public String multiply(String num1, String num2) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	Long a = Long.parseLong(num1);
    	Long b = Long.parseLong(num2);
    	Long c = a*b;
    	return c.toString();
    }
    public static void main(String args[]){
    	MultiplyStr ms = new MultiplyStr();
    	System.out.println(ms.multiply("401716832807512840963","401716832807512840963"));
    }
}
