import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class MergeInterval {
	public class IntervalComparator implements Comparator<Interval>{


		@Override
		public int compare(Interval o1, Interval o2) {
			// TODO Auto-generated method stub
			return o1.start-o2.start;
		}
		
	}
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        // Start typing your Java solution below
        // DO NOT write main() function
        IntervalComparator ic = new IntervalComparator();
        Collections.sort(intervals,ic);
        ArrayList<Interval> aList = new ArrayList<Interval>();
        if(intervals.size() == 0)
        	return aList;
        int start=intervals.get(0).start;
        int end=intervals.get(0).end;       
        for(Interval iv: intervals){
        	if(iv.start > end){
        		aList.add(new Interval(start,end));
        		start = iv.start;
        		end = iv.end;
        	}
        	else{
        		end = Math.max(end, iv.end);
        	}
        }
        aList.add(new Interval(start,end));
        return aList;
    }
    public static void main(String args[]){
    	MergeInterval mi = new MergeInterval();
    	ArrayList<Interval> iv = new ArrayList<Interval>();
    	iv.add(new Interval(1,3));
    	iv.add(new Interval(2,6));
    	iv.add(new Interval(8,10));
    	iv.add(new Interval(15,18));
    	ArrayList<Interval> aList = mi.merge(iv);
    	System.out.println(aList);
    }
}
