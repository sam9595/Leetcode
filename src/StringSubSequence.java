
public class StringSubSequence {
    public int numDistinct(String S, String T) {
    	int sum = 0;
    	if(T.length() == 0)
    		return 1;
    	if(T.length() > S.length())
    		return 0;
    	if(T.length() == S.length()){
    		if(T.equals(S))
    			return 1;
    		else
    			return 0;
    	}
    	int ind = S.indexOf(T.charAt(0));
    	if(ind >= 0){
    		sum += numDistinct(S.substring(ind+1,S.length()),T);
    		sum += numDistinct(S.substring(ind+1,S.length()),T.substring(1,T.length()));
    	}
    	return sum;
    }
    public int numDistinct2(String S, String T){
    	int mat[][] = new int[S.length()+1][T.length()+1];
    	for(int j = 0 ; j < T.length() + 1 ; j++)
    		mat[0][j] = 0;
    	for(int i = 0 ; i < S.length() + 1 ;i++)
    		mat[i][0] = 1;
    	for(int i = 1 ; i < S.length() + 1 ; i++){
    		for(int j = 1 ; j < T.length()+1 ; j++){
    			if(S.charAt(i-1) == T.charAt(j-1)){
    				mat[i][j] = mat[i-1][j] + mat[i-1][j-1];
    			}
    			else{
    				mat[i][j] = mat[i-1][j];
    			}
    		}
    	}
    	return mat[S.length()][T.length()];
    }
    public static void main(String args[]){
    	StringSubSequence s = new StringSubSequence();
    	int a = s.numDistinct2("ddd","dd");
    	//int a = s.numDistinct2("aabdbaabeeadcbbdedacbbeecbabebaeeecaeabaedadcbdbcdaabebdadbbaeabdadeaabbabbecebbebcaddaacccebeaeedababedeacdeaaaeeaecbe", "bddabdcae");
    	System.out.println(a);
    }
}
