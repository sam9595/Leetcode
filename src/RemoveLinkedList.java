
public class RemoveLinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	ListNode start = head;
    	ListNode end = head;
    	while(n > 0){
    		end = end.next;
    		n--;
    	}
    	if(end == null)
    		return start.next;
    	while(true){
    		if(end.next == null){
    			start.next = start.next.next;
    			return head;
    		}
    		start = start.next;
    		end = end.next;
    	}
    }
    public static void main(String args[]){
    	ListNode a = new ListNode(1);
    	a.next = new ListNode(2);
    	a.next.next = new ListNode(3);
    	a.next.next.next = new ListNode(4);
    	a.next.next.next.next = new ListNode(5);
    	RemoveLinkedList r = new RemoveLinkedList();
    	a = r.removeNthFromEnd(a, 2);
    	while(a != null){
    		System.out.println(a.val);
    		a = a.next;
    	}
    }
}
