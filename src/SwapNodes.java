
public class SwapNodes {
    public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	ListNode curr = head;
    	if(head == null || head.next == null)
    		return head;
    	else
    		head = head.next;
    	while(curr!= null && curr.next != null){ 		
    		ListNode temp = curr.next.next;
    		curr.next.next = curr;
    		if(temp!= null && temp.next != null)
    			curr.next = temp.next;
    		else
    			curr.next = temp;
    		curr = temp;

    	}
    	return head;
    }
    public static void main(String args[]){
    	//ListNode a = null;
    	ListNode a = new ListNode(1);
    	//a.next = new ListNode(2);
    	//a.next.next = new ListNode(3);
    	//a.next.next.next = new ListNode(4);
    	
    	SwapNodes s = new SwapNodes();
    	ListNode b = s.swapPairs(a);
    	while(b != null){
    		System.out.println(b.val);
    		b = b.next;
    	}
    }
}
