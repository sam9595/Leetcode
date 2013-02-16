import java.util.ArrayList;


public class Pascal1 {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> Pascal = new ArrayList<ArrayList<Integer>>();    
        ArrayList<Integer> row = new ArrayList<Integer>();
        if(numRows == 0)
            return Pascal;
        row.add(1);
        Pascal.add(row);
        for(int i = 1 ; i < numRows ;i++){
            row = new ArrayList<Integer>();
            row.add(1);
            for(int j = 0 ; j + 1 < Pascal.get(i-1).size() ; j++){
                row.add(Pascal.get(i-1).get(j) + Pascal.get(i-1).get(j+1));
            }
            row.add(1);
            Pascal.add(row);
        }
        return Pascal;
        
    }	
    public static void main(String args[]){
    	Pascal1 a = new Pascal1();
    	System.out.println(a.generate(6));
    }
}
