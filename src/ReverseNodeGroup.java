import java.util.Stack;


public class ReverseNodeGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	Stack<ListNode> st = new Stack<ListNode>();
    	ListNode head2= new ListNode(0);
    	ListNode prev = head2;
    	prev.next = head;
    	ListNode curr = head;
    	int c = k;
    	if(k <= 1)
    		return head;
    	while(curr != null){

    		c--;
    		st.push(curr);
    		curr = curr.next;
    		if(c == 0){
    			ListNode tempcurr = prev;
    			while(!st.empty()){
    				tempcurr.next = st.pop();
    				tempcurr = tempcurr.next;
    			}
    			prev = tempcurr;
    			prev.next = curr;
    			c = k;
    			continue;
    		}    		
    	}
    	return head2.next;
    }	
	public static void main(String args[]){
    	//ListNode a = null;
    	ListNode a = new ListNode(1);
    	a.next = new ListNode(2);
    	a.next.next = new ListNode(3);
    	a.next.next.next = new ListNode(4);
    	a.next.next.next.next= new ListNode(5);
    	a.next.next.next.next.next = new ListNode(6);
    	ReverseNodeGroup r = new ReverseNodeGroup();
    	ListNode b = r.reverseKGroup(a, 3);
    	while(b !=null){
    		System.out.println(b.val);
    		b = b.next;
    	}
	}
}
