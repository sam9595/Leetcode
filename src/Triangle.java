import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Triangle {
    public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        for(int i = triangle.size() - 2 ; i >= 0 ; i --){
            for(int j = 0 ; j < i + 1 ; j++){
                triangle.get(i).set(j,triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1)));
            }
        }
        return (triangle.get(0).get(0));
    }
    public static void main(String args[]){
    	ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> m1 = new ArrayList<Integer>(Arrays.asList(2));
    	triangle.add(m1);
    	m1  = new ArrayList<Integer>(Arrays.asList(3,4));
    	triangle.add(m1);
    	m1 = new ArrayList<Integer>( Arrays.asList(6,5,7));
    	triangle.add(m1);
    	m1 = new ArrayList<Integer>(Arrays.asList(4,1,8,3));
    	triangle.add(m1);
    	System.out.println(triangle);
    	int a = minimumTotal(triangle);
    	System.out.println(a);
    }
}
