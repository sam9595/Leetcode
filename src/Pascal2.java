import java.util.ArrayList;


public class Pascal2 {
    public ArrayList<Integer> getRow(int rowIndex) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        for(int i = 0 ; i < rowIndex ; i++){
            list2 = new ArrayList<Integer>();
            list2.add(1);
            for(int j = 0 ; j + 1 < list1.size() ; j++){
                list2.add(list1.get(j) + list1.get(j+1));
            }
            list2.add(1);
            list1 = (ArrayList<Integer>)list2.clone();
        }
        return list1;
    }
}
