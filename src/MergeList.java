import java.util.ArrayList;


public class MergeList {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	ListNode head=null;
    	ListNode curr=null;
    	boolean first = true;
    	//ListNode curr = head;
    	while(true){

    		int min = Integer.MAX_VALUE;
    		int minIdx = 0;
    		for(int i = 0 ; i < lists.size(); i++){
    			//System.out.println(i);
       			ListNode a = lists.get(i);
    			if(a == null){
    				lists.remove(i);
    				i--;
    			}    			
    		}
    		if(lists.size() == 0)
    			break;    		
    		for(int i = 0 ; i < lists.size(); i++){
    			ListNode a = lists.get(i);
    			if(a.val < min){
    				min = a.val;
    				minIdx = i;
    			}
    		}
    		ListNode b = lists.get(minIdx);
    		if(first){
    			head = new ListNode(min);
    			curr = head;
    			lists.set(minIdx, b.next);
    			first =false;
    			continue;
    		}
    		else{
    			curr.next = new ListNode(min);
    			curr = curr.next;
    			lists.set(minIdx, b.next);
    			continue;
    		}
    	}
    	return head;
    }
    public static void main(String args[]){
    	ArrayList<ListNode> aList = new ArrayList<ListNode>();
    	ListNode a = new ListNode(3);
    	a.next = new ListNode(5);
    	a.next.next = new ListNode(7);
    	ListNode b = new ListNode(2);
    	b.next = new ListNode(4);
    	b.next.next= new ListNode(6);
    	ListNode c = new ListNode(1);
    	c.next = new ListNode(3);
    	aList.add(a);
    	aList.add(b);
    	aList.add(c);
    	MergeList m = new MergeList();
    	ListNode n = m.mergeKLists(aList);
    	while(n!=null){
    		System.out.println(n.val);
    		n = n.next;
    	}
    }
}
