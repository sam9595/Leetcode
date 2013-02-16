import java.util.ArrayList;


public class InsertInterval {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(intervals.size() == 0){
    		intervals.add(newInterval);
    		return intervals;
    	}
    	ArrayList<Interval> aList = new ArrayList<Interval>();
    	boolean finish=false;
        for(int i = 0 ; i < intervals.size(); i++){
        	Interval iv = intervals.get(i);
        	
        	if(newInterval.start > iv.end || finish){
        		aList.add(iv);
        		continue;
        	}
        	
        	if(newInterval.start < iv.start){
        		if(newInterval.end < iv.start){
        			aList.add(newInterval);
        			aList.add(iv);
        			finish = true;
        			continue;
        			//intervals.add(i,newInterval);
        			//return intervals;
        		}
        		else if(newInterval.end <= iv.end){
        			//intervals.remove(i);
        			//intervals.add(i,new Interval(newInterval.start,iv.end));
        			newInterval.end = iv.end;
        			aList.add(newInterval);
        			finish = true;
        			continue;
        		}
        		else{
        			//intervals.remove(i);
        			//i--;
        		}
        	}
        	else if(newInterval.start <= iv.end){
        		if(newInterval.end <= iv.end){
        			aList.add(iv);
        			finish = true;
        			//return intervals;
        		}
        		else{
        			//intervals.remove(i);
        			//i --;
        			newInterval.start = iv.start;        		
        		}
        	}
        }
        if(!finish)
        	aList.add(newInterval);
        return aList;
    }
    public static void main(String args[]){
    	InsertInterval ii = new InsertInterval();
    	ArrayList<Interval> it = new ArrayList<Interval>();
    	it.add(new Interval(1,5));
    	it.add(new Interval(6,9));
    	ArrayList<Interval> aList = ii.insert(it, new Interval(3,5));
    	System.out.println(aList);
    }
}
