
public class palindrome {
	public static boolean isPalindrome(int num){
		String str = Integer.toString(num);
		System.out.println(str);
		int i,j;
		for(i = 0, j = str.length() -1 ; i < j ; i++, j--){
			if(str.charAt(i) != str.charAt(j))
				return false;
		}
		return true;
	}
	public static void main(String args[]){
		boolean b = isPalindrome(123321);
		System.out.println(b);
	}
}
